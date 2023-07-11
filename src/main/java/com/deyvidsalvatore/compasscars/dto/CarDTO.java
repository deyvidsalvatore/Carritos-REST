package com.deyvidsalvatore.compasscars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    @NotNull(message = "idChassi cannot be null")
    @Positive(message = "idChassi must be greater than 0")
    private Long idChassi;

    @NotBlank(message = "name cannot be blank")
    @NotNull(message = "name cannot be null")
    private String name;

    @NotBlank(message = "brand cannot be blank")
    @NotNull(message = "brand cannot be null")
    private String brand;

    @NotBlank(message = "fabricationYear cannot be blank")
    @NotNull(message = "fabricationYear cannot be null")
    private String fabricationYear;

    @NotNull(message = "color cannot be blank")
    @NotNull(message = "color cannot be null")
    private String color;

}
