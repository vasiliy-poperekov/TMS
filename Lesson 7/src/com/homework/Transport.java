package com.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Transport {
    private double power, maxSpeed, weight;
    private String brand;

    @Override
    public String toString() {
        return "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand=" + brand;
    }
}