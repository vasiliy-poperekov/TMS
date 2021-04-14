package com.homework;

public class Main {

    public static void main(String[] args) {
        Person alexandr = new Person("Александр", "Минск", "Беларусь", 18, 'м');
        Person ivan = new Person("Иван", "Москва", "Россия", 17, 'м');
        Person ann = new Person("Анна", "Минск", "Беларусь", 22, 'ж');
        Person nikolay = new Person("Николай", "Москва", "Россия", 25, 'м');
        Person maria = new Person("Мария", "Киев", "Украина", 27, 'ж');

        PersonRegistry personRegistry = new PersonRegistry();
        personRegistry.addPersonToList(alexandr);
        personRegistry.addPersonToList(ivan);
        personRegistry.addPersonToList(ann);
        personRegistry.addPersonToList(nikolay);
        personRegistry.addPersonToList(maria);

        MillitaryOffice millitaryOffice = new MillitaryOffice(personRegistry);
        millitaryOffice.registryNames();
        millitaryOffice.registryFromMinsk();
        millitaryOffice.registryFrom25To27();
        millitaryOffice.registryAlexandrs();
    }
}
