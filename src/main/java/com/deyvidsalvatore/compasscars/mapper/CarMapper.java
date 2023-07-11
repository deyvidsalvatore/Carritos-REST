package com.deyvidsalvatore.compasscars.mapper;

import com.deyvidsalvatore.compasscars.dto.CarDTO;
import com.deyvidsalvatore.compasscars.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarDTO toDto (Car car) {
        CarDTO carDTO = new CarDTO();
        carDTO.setIdChassi(car.getIdChassi());
        carDTO.setName(car.getName());
        carDTO.setBrand(car.getBrand());
        carDTO.setColor(car.getColor());
        carDTO.setFabricationYear(car.getFabricationYear());
        return carDTO;
    }

    public Car toEntity (CarDTO carDTO) {
        Car car = new Car();
        car.setIdChassi(carDTO.getIdChassi());
        car.setName(carDTO.getName());
        car.setBrand(carDTO.getBrand());
        car.setColor(carDTO.getColor());
        car.setFabricationYear(carDTO.getFabricationYear());
        return car;
    }
}
