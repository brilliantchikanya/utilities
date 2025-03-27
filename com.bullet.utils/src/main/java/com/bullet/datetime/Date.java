package com.bullet.datetime;

/*
 * @author brilliant
 * @author com.bullet
 * @since 23-02-2025
 * */


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static java.time.temporal.ChronoUnit.YEARS;

public class Date {
    LocalDate date;

    public Date(int year, int month, int day) {
        date = LocalDate.of(year, month, day);
    }
    public Date() {

    }
    // create date objects using factory methods
    public static LocalDate createDate(int year, Month month, int day) {
        return LocalDate.of(year, month, day);
    }
    // this derives a datetime object from the specified argument
    public static LocalDate createDate(LocalDateTime dateTime) {
        return LocalDate.from(dateTime);
    }
    // To change the year field on a date object, we use the withXxx methods
    public static LocalDate setYear(LocalDate date, int year) {
        return date.withYear(year);
    }
    // Changing the month field in a date object
    public static LocalDate setMonth(LocalDate date, int month) {
        return date.withMonth(month);
    }
    // get the specified element or field of a date object
    public static int getYear(LocalDate date) {
        return date.getYear();
    }
    public static Month getMonth(LocalDate date) {
        return date.getMonth();
    }
    public static int getMonthValue(LocalDate date) {
        return date.getMonthValue();
    }

    public static int getDay(LocalDate date) {
        return date.getDayOfMonth();
    }
    public static long getAge(LocalDate birthdate) {
        LocalDate today = LocalDate.now();
        return YEARS.between(birthdate, today);
    }
}
