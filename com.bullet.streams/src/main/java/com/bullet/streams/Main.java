package com.bullet.streams;

import com.bullet.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        //employee1.setDateJoined(new MyDate(2015, 10, 15));
        //System.out.println(employee1.getDateJoined());



        List<Employee> empList = new ArrayList<>();

        /*
        int employeeID;
        Name employeeName;
        Gender employeeGender;
        String employeeEmail;
        String employeePhoneNumber;
        String employeeDepartment;
        String jobTitle;
        int salary;
        MyDate dateJoined;

        */



//        empList.add(new Employee(1, new Name("Brilliant", "Chikanya"),
//                Gender.MALE, " ", " ",
//                "HR", "HR Manager", 15000,
//                new MyDate(2020, 05, 15)));
        /*
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));

        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));

        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));

        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));

        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));

        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));

        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));


         */
        System.out.println(empList);
    }

}
