package com.Human.Jackets;

public class YellowJacket implements Jacket {
    @Override
    public void tryOn() {
        System.out.println("Красная куртка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Красная куртка снята");
    }
}
