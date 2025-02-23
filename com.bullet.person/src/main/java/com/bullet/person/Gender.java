package com.bullet.person;


/*
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public enum Gender {
    MALE(0),
    FEMALE(1);

    final int status;     /* for lack of a better word or term. this variable is
                        not really necessary, but just because i can, i put it there.
                        might as well remove it*/

    Gender(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

