package com.bullet.person;

import com.bullet.names.Name;

import java.util.Objects;

/*
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Person {
    private Name name;
    private Gender gender;
    private MyDate dateOfBirth;


    public Person(Name name, Gender gender) {
        this.name = name;
        this.gender = gender;
        dateOfBirth = null;
    }

    public Person() {
        name = new Name();
        gender = null;
        dateOfBirth = null;

    } // end of constructor

    // beginning of getter and setter methods
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MyDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(MyDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }   // end of getter and setter methods

    // method calculates and returns the age of a person
    private int getAge() {
        // TODO
        return 0;
    }

    /* Two important methods which must be overridden, the equals method and
     *  the toString, and the hashCode as well*/
    @Override
    public boolean equals(Object comparisonObject) {
        if (this == comparisonObject) return true;  /* The == operator when used with reference
                                                    objects compares whether the two objects refer to
                                                    the same object, ie they refer to the same address*/
        if (comparisonObject == null || getClass() != comparisonObject.getClass()) return false;
        Person person = (Person) comparisonObject;
        return Objects.equals(getName(), person.getName()) && getGender() == person.getGender();
    }

    @Override
    public String toString() {
        return getName() + "" + getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender());
    }


}
