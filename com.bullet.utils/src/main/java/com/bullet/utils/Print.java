package com.bullet.utils;


/*
 * @author brilliant
 * @author com.bullet
 * @since 01-12-2024
 * */

import java.io.PrintStream;

/* We will use the methods in this class to reduce typing*/
public class Print {
    // print and add a new line
    public static void print(Object object) {
        System.out.println(object);
    }

    // print without adding a line break
    public static void printnb(Object object) {
        System.out.print(object);
    }

    // print a blank new line
    public static void print() {
        System.out.println();
    }

    // use the C-style printf function
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

    // create a division on the console
    public static void printStars() {
        print();
        print();
        print("***********************************************************");
        print();
        print();
    }


}
