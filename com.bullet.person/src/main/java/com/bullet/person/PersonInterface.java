package com.bullet.person;
import static java.time.temporal.ChronoUnit.YEARS;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public interface PersonInterface {
    default long calculateAge(LocalDate birthdate) {
        LocalDate today = LocalDate.now();
        return YEARS.between(birthdate, today);
    }
}
