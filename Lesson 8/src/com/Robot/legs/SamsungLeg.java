package com.Robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг ногой от Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}