package com.bullet.user;

import com.bullet.names.Name;
import com.bullet.person.Gender;
import com.bullet.person.MyDate;
import com.bullet.person.Person;

import java.time.LocalDate;

public class User implements UserInterface{
    private Person user;


    public User() {
        user = new Person();
    }

    public User(Person person) {
        this.user = person;
    }


    public static void main(String[] args) {
        User user1 = new User();
        Name name = new Name("Brilliant");
        Person person = user1.user;
        person.setName(name);
        person.setGender(Gender.MALE);
        person.setDateOfBirth(LocalDate.now());
        System.out.println(person);

    }

    @Override
    public User login() {
        return new User();
        //return user;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int userId) {

    }
}
