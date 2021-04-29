package com.Robot;


import com.Robot.hands.IHand;
import com.Robot.hands.SamsungHand;
import com.Robot.hands.SonyHand;
import com.Robot.hands.ToshibaHand;
import com.Robot.heads.IHead;
import com.Robot.heads.SamsungHead;
import com.Robot.heads.SonyHead;
import com.Robot.heads.ToshibaHead;
import com.Robot.legs.ILeg;
import com.Robot.legs.SamsungLeg;
import com.Robot.legs.SonyLeg;
import com.Robot.legs.ToshibaLeg;

import java.util.Scanner;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public void setHead() {
        this.head = choiceHead();
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public void setHand() {
        this.hand = choiceHand();
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public void setLeg() {
        this.leg = choiceLeg();
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    public IHand choiceHand() {
        System.out.println("Введите фирму для рук");
        String brand = choiceBrand();
        if (brand.equals("Samsung")) {
            return new SamsungHand(100);
        }
        else if (brand.equals("Sony")){
            return new SonyHand(200);
        }
        else{
            return new ToshibaHand(300);
        }
    }

    public IHead choiceHead() {
        System.out.println("Введите фирму для головы");
        String brand = choiceBrand();
        if (brand.equals("Samsung")) {
            return new SamsungHead(150);
        }
        else if (brand.equals("Sony")){
            return new SonyHead(250);
        }
        else{
            return new ToshibaHead(350);
        }
    }

    public ILeg choiceLeg() {
        System.out.println("Введите фирму для ног");
        String brand = choiceBrand();
        if (brand.equals("Samsung")) {
            return new SamsungLeg(200);
        }
        else if (brand.equals("Sony")){
            return new SonyLeg(300);
        }
        else{
            return new ToshibaLeg(400);
        }
    }

    public String choiceBrand() {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите название фирмы");
        String brand = scanner.nextLine();
        return brand;
    }
}
