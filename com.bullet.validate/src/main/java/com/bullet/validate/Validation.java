package com.bullet.validate;

import java.util.Objects;

public class Validation {
    public static boolean isNull(String string) {
        if (string == null || string.isEmpty()) return true;
        return false;
    }
    // create a method to validate emails
    public static boolean isValidEmail(String email) {
        return false;
    }
}
