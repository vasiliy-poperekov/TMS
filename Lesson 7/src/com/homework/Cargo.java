package com.homework;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cargo extends Earth {
    private double weightPower;

    public Cargo(double power, double maxSpeed, double weight, String brand, int wheels, double expenditure, double weightPower) {
        super(power, maxSpeed, weight, brand, wheels, expenditure);
        this.weightPower = weightPower;
    }

    @Override
    public String toString() {
        System.out.print("Cargo ");
        return super.toString() +
                "weightPower=" + weightPower;
    }

    public void checkWeight(double weight) {
        if (weight <= weightPower) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}