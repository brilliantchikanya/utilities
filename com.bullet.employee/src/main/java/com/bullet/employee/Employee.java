package com.bullet.employee;

/*
 * @author brilliant
 * @author com.bullet
 * @since 23-02-2025
 * */

import com.bullet.names.Name;
import com.bullet.person.Gender;
import com.bullet.person.Person;

import java.util.Objects;

public class Employee {
    private long employeeID;
    private Person person;
    //TODO the employeeNumber needs a relook
    /*  need to use the factory design pattern to achieve that,
    *   as implemented in the sqlite3 project  */
    //private String employeeNumber;
    private static int emp_number;  //for generating employee number

    // beginning of constructors
    public Employee() {
        this.person = new Person();
        //this.employeeNumber = "";
    }

    public Employee(Person person) {
        this.person = person;
        //this.employeeNumber = generateEmploymentNumber();
    }
    public Employee(String firstname, String lastname) {
        this.person = new Person(firstname, lastname);
        //this.employeeNumber = generateEmploymentNumber();
    }
    public Employee(String firtname) {
        this.person = new Person(firtname);
        //this.employeeNumber = generateEmploymentNumber();
    }
    public Employee(Person person, Gender gender) {
        this.person = person;
        this.person.setGender(gender);
        //this.employeeNumber = generateEmploymentNumber();

    }// end constructor

    // beginning of getter and setter methods


    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }


    public String getEmployeeName() {
        return person.getName().toString();
    }

    public String getEmployeeFirstName() {
        return this.person.getName().getFirstName();
    }



//    public String getEmployeeNumber() {
//        if (employeeNumber == null || employeeNumber.isEmpty()) {
//            return this.generateEmploymentNumber();
//        }
//        else {
//            return employeeNumber;
//        }
//    }
//
//    public void setEmployeeNumber(String employeeNumber) {
//        if (employeeNumber == null || employeeNumber.isEmpty()) {
//            this.employeeNumber = employeeNumber;
//        }
//    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return employeeID == employee.employeeID && Objects.equals(person.getName(), employee.getEmployeeName()) && person.getGender() == employee.person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, person.getName(), person.getGender());
    }

    private String generateEmploymentNumber() {
        String prefix = "BSC";  // can be changed or made custom
        if (emp_number == 9) {
            ++emp_number;
            return prefix + "0010";
        } else if (emp_number < 10) {
            return prefix + "000" + ++emp_number;
        }  else if (emp_number == 99) {
            ++emp_number;
            return prefix + "0100";

        } else if (emp_number < 100) {
            return prefix + "00" + ++emp_number;
        } else if (emp_number == 999) {
            ++emp_number;
            return prefix + "1000";
        } else if (emp_number < 1000) {
            return prefix + "0" + ++emp_number;

        } else if (emp_number < 10000) {
            return prefix + ++emp_number;
        }
        return prefix + ++emp_number;

    }

}
