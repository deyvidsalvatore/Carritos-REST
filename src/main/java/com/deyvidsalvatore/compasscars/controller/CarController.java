package com.deyvidsalvatore.compasscars.controller;

import com.deyvidsalvatore.compasscars.dto.CarDTO;
import com.deyvidsalvatore.compasscars.response.ErrorResponse;
import com.deyvidsalvatore.compasscars.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    private final ErrorResponse errorResponse;

    public CarController(CarService carService, ErrorResponse errorResponse) {
        this.carService = carService;
        this.errorResponse = errorResponse;
    }

    @PostMapping("/post")
    public ResponseEntity<?> save(@RequestBody CarDTO carDTO, HttpServletRequest request) {
        try {
            return ResponseEntity.ok(carService.save(carDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return errorResponse.createErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage(), request);
        }
    }

    @GetMapping("/get/{idChassi}")
    public ResponseEntity<?> getCarByIdChassi(@PathVariable Long idChassi, HttpServletRequest request) {
        try {
            return ResponseEntity.ok(carService.getCarByIdChassi(idChassi));
        }
        catch (Exception e) {
            e.printStackTrace();
            return errorResponse.createErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage(), request);
        }
    }

}
