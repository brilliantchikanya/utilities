package com.bullet.person;

import java.time.LocalDate;

public class MyDate {
    //TODO need to work on this class and add static methods for formatting dates

    public static LocalDate create(int year, int month, int day) {
        return LocalDate.of(year, month, day);

    }

}
