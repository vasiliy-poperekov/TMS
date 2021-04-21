package com.Cosmodrom;

import java.util.Random;

public class Shutle implements IStart{
    @Override
    public boolean check() {
        Random random = new Random();

        if(random.nextInt(11)>3)
        {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла.");
    }
}
