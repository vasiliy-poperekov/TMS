package com.Human.Trousers;

public class ClassicalTrousers implements Trousers{
    @Override
    public void tryOn() {
        System.out.println("Классические брюки надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Классические брюки сняты");
    }
}
