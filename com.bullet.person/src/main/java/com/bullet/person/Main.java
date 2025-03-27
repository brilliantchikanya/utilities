package com.bullet.person;

import com.bullet.names.Name;

public class Main {
    public static void main(String[] args) {
        Name myName = new Name("Trevor");
        Person person = new Person(myName, Gender.MALE);
        System.out.println(person); // Trevor MALE
        Gender rudzi = Gender.MALE;
        // print the gender as a string
        System.out.println(rudzi.name());
    }
}
