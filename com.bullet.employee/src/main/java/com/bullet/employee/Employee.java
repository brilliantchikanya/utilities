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
        return person.getName();
    }

    public String getEmployeeFirstName() {
        return this.person.getFirstName();
    }

    public String getEmployeeLastName() {
        return this.person.getLastName();
    }

    public void setEmployeeFirstName(String firstname) {
        this.person.setFirstName(firstname);
    }

    public void setEmployeeLastName(String lastname) {
        this.person.setLastName(lastname);
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

    public void setEmployeeName(Name employeeName) {
        this.person.setName(employeeName);
    }

    public Gender getEmployeeGender() {
        return this.person.getGender();
    }

    public void setEmployeeGender(Gender employeeGender) {
        this.person.setGender(employeeGender);
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person.getName();
    }
    /* there is need to check the correctness of the overridden methods above*/

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return employeeID == employee.employeeID && Objects.equals(person.getName(), employee.getEmployeeName()) && person.getGender() == employee.person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, person.getName(), person.getGender());
    }


    /*
   PAYSLIP
        //date of pay period e.g 2025-01-30
        //name, address, jobtitle
        //days worked or hours worked
        //payee
        //pre-tax deductions e.g medical and retirement
        //after tax deductions e.g unions, life insurance
        //employer paid contributions
        //net salary

    FIELDS
        //fixed_salary ---monthly or annually
        //daily_rate
        //hourly_rate
            //active_status
            //suspension_status
            //termination_status
            //leave_status
        //department ---related to pay-grade
        //supervisor
            //pay_grade
            //roles --e.g admin, supervisor, general, sudo
        //over_time_rate
        //marital_status
        //national_id
            //usd_account  ---name, branch, contacts, account number
            //zig_account
        //date_of_birth
        //place_of_birth
        //number_of_dependants
        //next_of_keen


     DEDUCTIONS
        ***pre-tax and post-tax
        ***mandatory and voluntary
        ***employee and employer contributions
        //payee - income tax
        //nssa - retirement or pension
        //cimas - medical aid
        //nyaradzo - funeral assurance
        //life_assurance
        //aids_levy
        //nec
        //union_fees
        //wage_garnishes


     BENEFITS
        //incentives or bonus schemes
        //overtime
        //fringe_benefits
        //retirement_lumpsum
        //benefit plan contributions

    * */

    public static void main(String[] args) {
        //System.out.println(emp_number);
        Employee employee = new Employee();
        Person person1 = new Person();
        Gender gender = Gender.MALE;
        person1.setGender(gender);
        person1.setName(new Name("Brilliant", "Chikanya"));
        employee.setPerson(person1);
        //System.out.println("number: " + employee.getEmployeeNumber());
        //employee.setEmployeeNumber("abc");


        System.out.println(person1);
        System.out.println(person1.getGender());
        System.out.println(person1.getFirstName());
        System.out.println(employee.getEmployeeGender());
        //System.out.println(employee.getEmployeeNumber() + "   ...");

        Employee employee1 = new Employee("testing");
        //employee1.setEmployeeNumber();
        System.out.println();
        System.out.println();
        System.out.println(employee1.getEmployeeName());
        //System.out.println(employee1.getEmployeeNumber());
        System.out.println(emp_number);
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
