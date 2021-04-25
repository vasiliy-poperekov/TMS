package com.Human.Trousers;

public class Jeans implements Trousers {
    @Override
    public void tryOn() {
        System.out.println("Джинсы надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Джинсы сняты");
    }
}
