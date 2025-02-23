package com.bullet.names;

import java.util.Comparator;

public class NameComparator implements Comparator<Name> {
    @Override
    public int compare(Name name, Name another) {
        return name.getFirstName().compareTo(another.getFirstName());
    }

}
