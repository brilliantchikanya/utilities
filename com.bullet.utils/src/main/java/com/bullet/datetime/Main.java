package com.bullet.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.YEARS;

public class Main {
    public static void main(String[] args) {


        LocalDate birthdate = LocalDate.of(1986, 10, 04);
        long age = Date.getAge(birthdate);
        System.out.println("I am " + age + " years old.");
    }
}
