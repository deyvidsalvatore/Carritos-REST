package com.deyvidsalvatore.compasscars.mapper;

import com.deyvidsalvatore.compasscars.dto.CarDTO;
import com.deyvidsalvatore.compasscars.entity.Car;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarMapperTests {

    @InjectMocks
    private CarMapper carMapper;

    @Test
    public void testToEntity() {
        CarDTO carDTO = new CarDTO();
        carDTO.setIdChassi(123L);
        carDTO.setName("Aspire");
        carDTO.setBrand("Ford");
        carDTO.setFabricationYear("1994/1997");

        Car car = carMapper.toEntity(carDTO);

        assertEquals(carDTO.getIdChassi(), car.getIdChassi());
        assertEquals(carDTO.getName(), car.getName());
        assertEquals(carDTO.getBrand(), car.getBrand());
        assertEquals(carDTO.getFabricationYear(), car.getFabricationYear());
    }

    @Test
    public void testToDto() {
        Car car = new Car();
        car.setIdChassi(123L);
        car.setName("Aspire");
        car.setBrand("Ford");
        car.setFabricationYear("1994/1997");

        CarDTO carDTO= carMapper.toDto(car);

        assertEquals(carDTO.getIdChassi(), car.getIdChassi());
        assertEquals(carDTO.getName(), car.getName());
        assertEquals(carDTO.getBrand(), car.getBrand());
        assertEquals(carDTO.getFabricationYear(), car.getFabricationYear());
    }
}
