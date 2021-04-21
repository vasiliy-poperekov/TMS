package com.Robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднятие руки вверх от Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
