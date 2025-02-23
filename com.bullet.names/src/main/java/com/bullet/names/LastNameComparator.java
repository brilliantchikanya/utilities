package com.bullet.names;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Name> {
    @Override
    public int compare(Name name, Name another) {
        return name.getLastName().compareTo(another.getLastName());
    }
}
