package com.homework;

import java.util.ArrayList;

public class MillitaryOffice {
    private PersonRegistry personRegistry;

    public MillitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void registryNames() {
        for (int i = 0; i < personRegistry.getPersonArrayList().size(); i++) {
            if (personRegistry.getPersonFromList(i).getAge() >= 18
                    && personRegistry.getPersonFromList(i).getAge() <= 27
                    && personRegistry.getPersonFromList(i).getSex() == 'м') {
                System.out.println(personRegistry.getPersonFromList(i).getName());
            }
        }
    }

    public void registryFromMinsk() {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersonArrayList().size(); i++) {
            if (personRegistry.getPersonFromList(i).getAge() >= 18
                    && personRegistry.getPersonFromList(i).getAge() <= 27
                    && personRegistry.getPersonFromList(i).getSex() == 'м'
                    && personRegistry.getPersonFromList(i).getCity().equals("Минск")) {
                count++;
            }
        }
        System.out.println("Количество Минских призывников = " + count);
    }

    public void registryFrom25To27() {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersonArrayList().size(); i++) {
            if (personRegistry.getPersonFromList(i).getAge() >= 25
                    && personRegistry.getPersonFromList(i).getAge() <= 27
                    && personRegistry.getPersonFromList(i).getSex() == 'м') {
                count++;
            }
        }
        System.out.println("Количество призывников от 25 до 27 = " + count);
    }

    public void registryAlexandrs() {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersonArrayList().size(); i++) {
            if (personRegistry.getPersonFromList(i).getAge() >= 18
                    && personRegistry.getPersonFromList(i).getAge() <= 27
                    && personRegistry.getPersonFromList(i).getSex() == 'м'
                    && personRegistry.getPersonFromList(i).getName().equals("Александр")) {
                count++;
            }
        }
        System.out.println("Количество призывников по имени Александр = " + count);
    }
}
