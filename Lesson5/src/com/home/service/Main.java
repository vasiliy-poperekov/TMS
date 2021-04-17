package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 16, 1000, 2);
        computer.Printer();
        computer.On();
        computer.On();
    }
}
