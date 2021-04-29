package com.Cosmodrom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IStart rocket = new Rocket();
        IStart shutle = new Shutle();
        Cosmodrom cosmodrom = new Cosmodrom();

        cosmodrom.starting(rocket);
        System.out.println();
        cosmodrom.starting(shutle);
    }
}
