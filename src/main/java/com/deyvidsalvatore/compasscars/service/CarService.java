package com.deyvidsalvatore.compasscars.service;

import com.deyvidsalvatore.compasscars.dto.CarDTO;
import com.deyvidsalvatore.compasscars.entity.Car;
import com.deyvidsalvatore.compasscars.mapper.CarMapper;
import com.deyvidsalvatore.compasscars.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.Arrays;
import java.util.List;

@Service
@Validated
public class CarService {

    private final CarRepository carRepository;

    private final CarMapper carMapper;

   public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
       this.carMapper = carMapper;
   }

    public CarDTO save(@Valid CarDTO carDTO) {
        Car car = carRepository.save(carMapper.toEntity(carDTO));
        return carMapper.toDto(car);
    }

    public CarDTO getCarByIdChassi(@Positive(message = "idChassi must be greater than 0") Long idChassi) throws Exception {
       Car car = carRepository.findById(idChassi).orElseThrow(() -> new Exception("Not found: Car with idChassi: "+idChassi));
       return carMapper.toDto(car);
    }


}
