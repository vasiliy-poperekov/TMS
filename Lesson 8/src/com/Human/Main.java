package com.Human;

import com.Human.Jackets.YellowJacket;
import com.Human.Shoes.Boots;
import com.Human.Trousers.Jeans;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Alexandr", new YellowJacket(), new Boots(), new Jeans());
        human.tryOn();
        System.out.println();
        human.takeOff();
    }
}
