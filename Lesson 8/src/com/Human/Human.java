package com.Human;

import com.Human.Jackets.Jacket;
import com.Human.Shoes.Shoes;
import com.Human.Trousers.Trousers;

public class Human implements IHuman {
    private String name;
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Human(String name, Jacket jacket, Shoes shoes, Trousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public void tryOn() {
        jacket.tryOn();
        shoes.tryOn();
        trousers.tryOn();
    }

    public void takeOff() {
        jacket.takeOff();
        shoes.takeOff();
        trousers.takeOff();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }
}
