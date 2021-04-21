package com.Cosmodrom;

import java.util.Random;
import java.util.Scanner;

public class Rocket implements IStart{
    @Override
    public boolean check() {
        System.out.println("Введите 0 или 1 для запуска ракеты");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        Random random = new Random();
        if(random.nextInt(2)==number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Ракеты запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Ракета.");
    }
}
