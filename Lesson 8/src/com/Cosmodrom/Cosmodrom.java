package com.Cosmodrom;

public class Cosmodrom {
    public void starting(IStart iStart) throws InterruptedException {
        if (iStart.check())
        {
            iStart.startEngine();
            for (int i =0;i<10;i++)
            {
                System.out.println(10-i);
                Thread.sleep(1000);
            }
            iStart.start();
        }
        else
        {
            System.out.println("Предстартовая проверка провалена.");
        }
    }

}
