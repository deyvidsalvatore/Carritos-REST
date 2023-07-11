package com.deyvidsalvatore.compasscars.controller;

import com.deyvidsalvatore.compasscars.dto.CarDTO;
import com.deyvidsalvatore.compasscars.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/post")
    public ResponseEntity<?> save(@RequestBody CarDTO carDTO) {
        try {
            return ResponseEntity.ok(carService.save(carDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Exception: " + e.getMessage());
        }
    }

    @GetMapping("/get/{idChassi}")
    public ResponseEntity<?> getCarByIdChassi(@PathVariable Long idChassi) {
        try {
            return ResponseEntity.ok(carService.getCarByIdChassi(idChassi));
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Exception: " + e.getMessage());
        }
    }

}
