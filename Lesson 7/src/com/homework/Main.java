package com.homework;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(100, 150, 2, "Nissan", 4, 10, "Sedan", 5);
        Cargo cargo = new Cargo(200, 140, 4, "Камаз", 6, 20, 1000);
        Civil civil = new Civil(1000, 500, 10, "Boing", 10, 15, 50, true);
        Military military = new Military(1500, 750, 7, "Су", 6, 5, 10, true);

        System.out.println(passenger);
        System.out.println(cargo);
        System.out.println(civil);
        System.out.println(military + "\n");

        passenger.info(2);
        cargo.checkWeight(1001);
        civil.checkWeight(75);
        military.shoot();
        military.catapult();
    }
}
