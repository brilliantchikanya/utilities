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
    String nationalID;
    MaritalStatus maritalStatus;
    private String email;
    private String phoneNumber;

    public Person(String firstname) {
        this.getName().setFirstName(firstname);
        //create(firstname);
    }

    public Person(String firstname, String lastname) {
        this.getName().setFirstName(firstname);
        this.getName().setLastName(lastname);
    }

    public Person(Name name, Gender gender) {
        this.name = name;
        this.gender = gender;
        dateOfBirth = MyDate.create(1900,1,1);
    }

    public Person() {
        name = new Name();
        gender = Gender.UNKNOWN;
        dateOfBirth = MyDate.create(1900,1,1);
    }

    // end of constructor

    // beginning of getter and setter methods
    public Name getName() {
        return this.name;
    }
    public void setName(Name name) {
        this.name = name;
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
    }

    public Address getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(Address placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getIdNumber() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // end of getter and setter methods


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
        return "Person{" +
                "name=" + name.getFirstName() + " " + name.getLastName() +
                ", gender=" + gender.name() +
                ", maritalStatus=" + maritalStatus.toString() +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender());
    }

}
