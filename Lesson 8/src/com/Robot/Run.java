package com.Robot;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
//        Robot robot1 = new Robot(new SamsungHead(100), new SonyHand(200), new ToshibaLeg(300));
//        Robot robot2 = new Robot(new SonyHead(250), new SamsungHand(150), new ToshibaLeg(300));
//        Robot robot3 = new Robot(new ToshibaHead(50), new ToshibaHand(100), new SonyLeg(250));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Robot> robotList = new ArrayList<>();
        System.out.println("Введите количество роботов");
        int number = scanner.nextInt();

        for(int i=0;i<number;i++)
        {
            System.out.println("Инофрмация о роботе номер "+(i+1));
            Robot robot = new Robot();
            robot.setHead();
            robot.setHand();
            robot.setLeg();
            robotList.add(robot);
            System.out.println();
        }

        for(Robot robot:robotList)
        {
            robot.action();
            System.out.println();
        }

        int maxPrice = Integer.MIN_VALUE, robotIndex = 1;

        for(Robot robot:robotList){
            if(robot.getPrice()>maxPrice)
            {
                maxPrice= robot.getPrice();
            }
            else
            {
                robotIndex++;
            }
        }

        System.out.println("Робот номер "+robotIndex+" имеет наибольшую цену, равную "+maxPrice);
    }
}
