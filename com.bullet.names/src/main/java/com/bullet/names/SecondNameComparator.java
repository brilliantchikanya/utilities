package com.bullet.names;

import java.util.Comparator;

public class SecondNameComparator implements Comparator<Name> {
    @Override
    public int compare(Name name, Name another) {
        return name.getSecondName().compareTo(another.getSecondName());
    }
}
