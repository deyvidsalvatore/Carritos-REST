package com.deyvidsalvatore.compasscars.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tbl_car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {

    @Id
    @Column(name = "id_chassi", unique = true, updatable = false)
    private Long idChassi;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "brand", length = 10, nullable = false)
    private String brand;

    @Column(name = "fabrication_year", length = 10, nullable = false)
    private String fabricationYear;

    @Column(name = "color", length = 10, nullable = false)
    private String color;

}