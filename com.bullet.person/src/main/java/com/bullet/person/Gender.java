package com.bullet.person;


/*
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public enum Gender {
    MALE, FEMALE, UNKNOWN;

   // final char status;
   /* for lack of a better word or term. this variable is
                        not really necessary, but just because i can, i put it there.
                        might as well remove it*/

//    Gender(char status) {
//        if(status == 'F') {
//            this.status = 'F';
//        } else if (status == 'M') {
//            this.status = 'M';
//        } else this.status = 'N';
//    }
//
//    public int getStatus() {
//        return status;
//    }

    @Override
    public String toString() {
        return this.name();

    }
}

