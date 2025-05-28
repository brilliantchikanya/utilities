package com.bullet.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {


    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // method to validate user input for digits
    public static boolean isDigit(String value) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
    // method that checks whether the input supplied is a float
    public static boolean isFloat(String value) {
        Pattern pattern = Pattern.compile("\\d+[.]?\\d*");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public static boolean isNull(String string) {
        return (string == null) || string.isEmpty();

    }
}
