package com.homework;

public class Military extends Air {
    private int rocketItems;
    private boolean catapult;

    public Military(double power, double maxSpeed, double weight, String brand, double lengthWing, double minLength, int rocketItems, boolean catapult) {
        super(power, maxSpeed, weight, brand, lengthWing, minLength);
        this.rocketItems = rocketItems;
        this.catapult = catapult;
    }

    @Override
    public String toString() {
        System.out.print("Military ");
        return super.toString() +
                ", rocketItems=" + rocketItems +
                ", catapult=" + catapult;
    }

    public void shoot() {
        if (rocketItems > 0) {
            System.out.println("Ракета пошла...");
            rocketItems--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
            catapult = false;
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}