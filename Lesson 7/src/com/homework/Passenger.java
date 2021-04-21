package com.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Passenger extends Earth {
    private String body;
    private int passengers;

    public Passenger(double power, double maxSpeed, double weight, String brand, int wheels, double expenditure, String body, int passengers) {
        super(power, maxSpeed, weight, brand, wheels, expenditure);
        this.body = body;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        System.out.print("Passenger ");
        return super.toString() +
                "body='" + body +
                ", passengers=" + passengers +
                ", power in kW = " + getPower() * 0.74;
    }

    public void info(double time) {
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет "
                + getMaxSpeed() * time + " км и израсходует " + getMaxSpeed() * time * getExpenditure() / 100 + " литров топлива.");
    }
}