package com.bullet.utils.main;

import com.bullet.names.Name;

import java.util.ArrayList;
import java.util.List;

import static com.bullet.utils.Print.*;
import static com.bullet.utils.Validation.*;

public class Main {
    public static void main(String[] args) {
        int x = 2, y = 3;
        printf("%d + %d = %d", x, y, x + y);
        print();
        print("My name is Brilliant");
        print("Adding 2 and 3 gives " + 5);
        printStars();
        print("Testing the method isNull()");
        String name = "Brilliant";
        String empty = "";
        print("The name object is null: "  + isNull(name));
        print("The empty object is null: "  + isNull(empty));

        printStars();
        print("Testing the Name class...");
        Name paul = new Name("Paul", "Chikanya");
        Name mia = new Name("Mia");
        Name camilla = new Name("Camilla", "Maita", "Chikanya");
        List<Name> names = new ArrayList<>();
        names.add(paul);
        names.add(mia);
        names.add(camilla);
        print("The names in the list are: " + names);
        Name.printNames(names);
        Name.sortByFirstName(names);
        print("The names sorted by first name are: " + names);
        Name.sortByLastName(names);
        print("The names sorted by last name are: " + names);
        Name.printNames(names);

        print("Checking for a digit...");
        String z = "5";
        //String value = "";
        if (isDigit(z)) {
            print("Its a number");
        } else print("Not a number");

        System.out.println();
        print("Checking for a float...");
        String vallue = "55.";
        //String value = "";
        if (isFloat(vallue)) {
            print("Its a float");
        } else print("Not a float");

        //System.out.println();
        print();
        print("Checking if email is valid...");
        String email = "bullet@gmail.com";
        if (isValidEmail(email)) print("Email valid");
        else print("Email not valid");
    }
}
