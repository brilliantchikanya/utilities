package com.bullet.employee;

import com.bullet.address.Address;
import com.bullet.person.MaritalStatus;
import com.bullet.person.Person;

import java.time.LocalDate;
import java.util.List;

public class PersonalDetails {
    private long personalDetailsID;
    private Person person;
    int numberOfDependants;
    private List<Person> nextOfKeen;

    public PersonalDetails() {
        this.person = new Person();
    }

    public PersonalDetails(Person person) {
        this.person = person;
    }

    /***************    GETTERS AND SETTERS     ***************/

    public long getpersonalDetailsID() {
        return personalDetailsID;
    }

    public void setId(long personalDetailsID) {
        this.personalDetailsID = personalDetailsID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public MaritalStatus getMaritalStatus() {
        return this.person.getMaritalStatus();
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.person.setMaritalStatus(maritalStatus);
    }

    public String getNationalId() {
        return this.person.getIdNumber();
    }

    public void setNationalId(String nationalID) {
        this.person.setNationalID(nationalID);
    }

    public LocalDate getDateOfBirth() {
        return this.person.getDateOfBirth();
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.person.setDateOfBirth(dateOfBirth);
    }

    public Address getPlaceOfBirth() {
        return this.person.getPlaceOfBirth();
    }

    public void setPlaceOfBirth(Address placeOfBirth) {
        this.person.setPlaceOfBirth(placeOfBirth);
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

    public void setNextOfKeen(List<Person> nextOfKeen) {
        this.nextOfKeen = nextOfKeen;
    }




    /****************   END GETTERS AND SETTERS     ***********/
}
