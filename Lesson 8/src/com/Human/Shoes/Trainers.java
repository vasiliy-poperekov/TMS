package com.Human.Shoes;

public class Trainers implements Shoes {
    @Override
    public void tryOn() {
        System.out.println("Кросовки надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кросовки сняты");
    }
}
