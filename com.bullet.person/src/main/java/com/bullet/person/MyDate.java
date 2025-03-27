package com.bullet.person;

import java.time.LocalDate;

public class MyDate {
    private LocalDate date;

    public MyDate() {
        date = LocalDate.now();
    }

    public MyDate (int year, int month, int day) {
        date = LocalDate.of(year, month, day);

    }

    public static LocalDate now() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return date + "";
    }
}
