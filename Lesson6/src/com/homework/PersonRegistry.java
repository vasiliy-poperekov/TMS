package com.homework;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> personArrayList = new ArrayList<>();

    public PersonRegistry() {}

    public void addPersonToList(Person person) {
        personArrayList.add(person);
    }

    public Person getPersonFromList(int index) {
        return personArrayList.get(index);
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }
}
