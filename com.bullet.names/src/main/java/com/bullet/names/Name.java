package com.bullet.names;

import java.util.*;
import static com.bullet.utils.Print.*;

/*
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Name {
    private String firstName;
    private String secondName;
    private String lastName;

    // constructors
    public Name() {
        firstName = "";
        secondName = "";
        lastName = "";
    }
    public Name(String firstName) {
        this.firstName = firstName;
        secondName = "";
        lastName = "";
    }

    public Name(String firstName, String lastName) {
        this(firstName);
        secondName = "";
        this.lastName = lastName;

    }

    public Name(String firstName, String secondName, String lastName) {
        this(firstName);
        this.secondName = secondName;
        this.lastName = lastName;
    } // end of constructors

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        if (another == null || getClass() != another.getClass()) return false;
        Name anotherName = (Name) another;
        if (hasSecondName()) {
            return Objects.equals(getFirstName(), anotherName.getFirstName())
                    && (getSecondName() == anotherName.getSecondName())
                    && Objects.equals(getLastName(), anotherName.getLastName());
        }
        return Objects.equals(getFirstName(), anotherName.getFirstName())
                && Objects.equals(getLastName(), anotherName.getLastName());
    }

    @Override
    public int hashCode() {
        if (hasSecondName()) {
            return Objects.hash(getFirstName(), getSecondName(), getLastName());
        }
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        if(hasSecondName()) {
            return firstName + " " + secondName + " " + lastName;
        }
        return firstName + " " + lastName;
    }

    private boolean hasSecondName() {
        if (getSecondName() == "") return false;
        return true;
    }

    public static void sortByFirstName(List<Name> names) {
        Comparator comparator = new NameComparator();
        Collections.sort(names, comparator);
    }

    public static void sortBySecondName(List<Name> names) {
        Comparator comparator = new SecondNameComparator();
        Collections.sort(names, comparator);
    }

    public static void sortByLastName(List<Name> names) {
        Comparator comparator = new LastNameComparator();
        Collections.sort(names, comparator);
    }

    public static void printNames(List<Name> nameList) {
        for (Name name: nameList) print(name);
    }


}
