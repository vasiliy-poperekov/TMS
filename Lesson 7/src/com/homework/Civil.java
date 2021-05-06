package com.homework;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Civil extends Air {
    private int passengers;
    private boolean buisness;

    public Civil(double power, double maxSpeed, double weight, String brand, double lengthWing, double minLength, int passengers, boolean buisness) {
        super(power, maxSpeed, weight, brand, lengthWing, minLength);
        this.passengers = passengers;
        this.buisness = buisness;
    }

    @Override
    public String toString() {
        System.out.print("Civil ");
        return super.toString() + ", passengers=" + passengers +
                ", buisness=" + buisness;
    }

    public void checkWeight(int people) {
        if (people <= passengers) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}