package com.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person {
    private String name, city, country;
    private int age;
    private char sex;
}
