package com.Robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднятие руки вверх от Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
