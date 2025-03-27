package com.bullet.validate;

public class Validation {
    public static boolean isNull(String string) {
        return (string == null) || string.isEmpty();

    }
    // create a method to validate emails
    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

    }
}
