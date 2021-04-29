package com.Human.Shoes;

public class Boots implements Shoes{
    @Override
    public void tryOn() {
        System.out.println("Ботинки надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Ботинки сняты");
    }
}
