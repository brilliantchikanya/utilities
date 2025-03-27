package com.bullet.employee;

import com.bullet.address.Address;
import com.bullet.person.MaritalStatus;
import com.bullet.person.MyDate;
import com.bullet.person.Person;

import java.util.List;

public class PersonalDetails {
    //private long id;
    private Person person;
    private String email;
    private String phoneNumber;
    private MaritalStatus maritalStatus;
    String nationalId;
    //usd_account  ---name, branch, contacts, account number
    //zig_account - this goes into payment details
    MyDate dateOfBirth;
    Address placeOfBirth;
    int numberOfDependants;
    private List<Person> nextOfKeen;

    public PersonalDetails() {
        this.person = new Person();
    }

    public PersonalDetails(Person person) {
        this.person = person;
    }

    /***************    GETTERS AND SETTERS     ***************/

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public MyDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(MyDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(Address placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getNumberOfDependants() {
        return numberOfDependants;
    }

    public void setNumberOfDependants(int numberOfDependants) {
        this.numberOfDependants = numberOfDependants;
    }

    public List<Person> getNextOfKeen() {
        return nextOfKeen;
    }

    public void setNextOfKeen(Person nextOfKeen) {
        this.nextOfKeen.add(nextOfKeen);
    }

    /****************   END GETTERS AND SETTERS     ***********/
}
