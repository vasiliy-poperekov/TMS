package com.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Air extends Transport {
    private double lengthWing, minLength;

    public Air(double power, double maxSpeed, double weight, String brand, double lengthWing, double minLength) {
        super(power, maxSpeed, weight, brand);
        this.lengthWing = lengthWing;
        this.minLength = minLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", lengthWing=" + lengthWing +
                ", minLength=" + minLength;
    }
}