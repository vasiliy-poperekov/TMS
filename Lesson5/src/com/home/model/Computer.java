package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor, computerStatus="Компьютер включен";
    int operativeMemory, hardMemory, resource, counter = 0;

    public Computer(String processor, int operativeMemory, int hardMemory, int resource) {
        this.processor = processor;
        this.operativeMemory = operativeMemory;
        this.hardMemory = hardMemory;
        this.resource = resource;
    }

    public void Printer()
    {
        System.out.println("Processor: "+processor);
        System.out.println("OperativeMemory: "+operativeMemory);
        System.out.println("HardMemory: "+hardMemory);
        System.out.println("Resource: "+resource);
    }

    public void On()
    {
        Random randomNumber = new Random();
        Scanner in = new Scanner(System.in);
        int numberIn;

        if(!computerStatus.equals("Компьютер сгорел!")&&counter<resource)
        {
            System.out.println("Внимание! Введите 0 или 1");
            numberIn = in.nextInt();
            if(numberIn==randomNumber.nextInt(2)&&counter<resource)
            {
                computerStatus = "Компьютер включен";
                System.out.println(computerStatus);
                counter++;
                Off();
            }
            else
            {
                if(counter>=resource)
                {
                    System.out.println("Вы привысили лимит ресурсов!");
                }
                computerStatus = "Компьютер сгорел!";
                System.out.println(computerStatus);
            }
        }
        else
        {
            if(counter>=resource)
            {
                System.out.println("Вы привысили лимит ресурсов!");
                computerStatus = "Компьютер сгорел!";
            }
            System.out.println(computerStatus);
        }

    }

    public void Off() {
        Random randomNumber = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Внимание! Введите 0 или 1");
        int numberIn = in.nextInt();
        if(numberIn==randomNumber.nextInt(2)&&counter<resource)
        {
            computerStatus = "Компьютер выключен";
            System.out.println(computerStatus);
            counter++;
        }
        else
        {
            if(counter>=resource)
            {
                System.out.println("Вы привысили лимит ресурсов!");
            }
            computerStatus = "Компьютер сгорел!";
            System.out.println(computerStatus);
        }
    }
}
