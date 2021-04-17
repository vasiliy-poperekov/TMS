package com.homework;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Earth extends Transport {
    private int wheels;
    private double expenditure;

    public Earth(double power, double maxSpeed, double weight, String brand, int wheels, double expenditure) {
        super(power, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.expenditure = expenditure;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wheels=" + wheels +
                ", expenditure=" + expenditure +
                ' ';
    }
}