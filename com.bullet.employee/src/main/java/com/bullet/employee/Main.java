package com.bullet.employee;

import com.bullet.names.Name;
import com.bullet.person.Gender;
import com.bullet.person.Person;

import static com.bullet.utils.Print.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Name name1 = new Name("Brilliant", "Chikanya");
        Person person = new Person(name1, Gender.MALE);
        employee1.setPerson(person);
        //employee1.setDateJoined(new MyDate(2019, 10, 15));
        printStars();
        print("Printing the details of an employee...");
        print();
        print();
        print(employee1);
//        print("The employee named " + employee1.getEmployeeName() +
//                " earns $" + employee1.getSalary() + " per month.");
 /*
        * Brilliant Chikanya, brilliant.chikanya@bulletcs.com, 0785932619, 12000, directors, ceo, 01-01-2013
        * Paul
        * Mia
        * Camilla
        * Martha
        * Tendai
        * Munyaradzi
        * Tapiwa
        * Kuda
        * Mary
        * Chido
        * */
    }
}
