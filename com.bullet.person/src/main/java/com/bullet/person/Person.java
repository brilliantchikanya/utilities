package com.bullet.person;

import com.bullet.address.Address;
import com.bullet.names.Name;

import java.time.LocalDate;
import java.util.Objects;

/*
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Person implements PersonInterface{
    private Name name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Address placeOfBirth;   //still work in progress
    String idNumber;
    MaritalStatus maritalStatus;

    /*
    *
    * employee personal details
        place of birth;national id;
        * marital status;dependents class;children class;next of keen*/

    public Person(String firstname) {
        create(firstname);
    }

    public Person(String firstname, String lastname) {
        //Person person = new Person();
        create(firstname, lastname);
    }

    public Person(Name name, Gender gender) {
        this.name = name;
        this.gender = gender;
        dateOfBirth = null;
    }

    public Person() {
        name = new Name();
        gender = Gender.UNKNOWN;
        dateOfBirth = null;

    } // end of constructor

    // constructor helper methods
    private void create(String name1, String name2) {
        this.name = new Name(name1, name2);
        this.gender = Gender.UNKNOWN;

    }

    private void create(String firstname) {
        this.name = new Name(firstname);
        this.gender = Gender.UNKNOWN;
    }// end of helper methods


    // beginning of getter and setter methods
    public String getName() {
        return this.getFirstName() + ", " + this.getLastName();
                //name.getFirstName() + " " ;
    }
    public String getFirstName() {
        return this.name.getFirstName();
    }

    public String getLastName() {
        return this.name.getLastName();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setName(String fname, String lname) {
        Name name = new Name(fname, lname);
        setName(name);
    }

    public void setFirstName(String firstName) {
        Name name = new Name(firstName);
        setName(name);
    }

    public void setLastName(String lastName) {
        Name name = new Name();
        this.name.setLastName(lastName);
    }

    public String getGenderName() {
        return gender.name();
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }   // end of getter and setter methods



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
        return getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender());
    }

    public static void main(String[] args) {
        String fname="Brill", lname="Chiks";
        Person person = new Person(fname, lname);
        person.setDateOfBirth(LocalDate.now());
        String name = person.getName();
        System.out.println(name);
        System.out.println(person.calculateAge(LocalDate.EPOCH));
        Person person1 = new Person(fname);
        System.out.println(person1);
        System.out.println(person1.getGender());
        System.out.println(person1.calculateAge(LocalDate.of(1984, 11,14)));
        Person mia = new Person();
        mia.name.setFirstName("Mia");
        System.out.println(mia);

    }


}
