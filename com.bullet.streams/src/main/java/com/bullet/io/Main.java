package com.bullet.io;

import com.bullet.employee.Employee;
import com.bullet.person.Gender;
import com.bullet.person.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(new Person("Tatenda", "Mwando"));
        employee.setEmployeeID(1);
        employee.setEmployeeGender(Gender.MALE);
        System.out.println(employee);


        //Path file = Paths.get("src/main/resources/employees.txt");

        File file = new File("com.bullet.streams/src/main/resources/employees.txt");
        try(FileWriter writer = new FileWriter(file, true);
            //BufferedWriter bf = new BufferedWriter(writer);
            PrintWriter out = new PrintWriter(writer))
        {
            long id = employee.getEmployeeID();
            String fname = employee.getEmployeeFirstName();
            String gender = employee.getEmployeeGender().toString();
            out.printf("%d,%s,%s\n", id, fname, gender);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
