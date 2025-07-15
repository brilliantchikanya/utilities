package com.bullet.model;

import static com.bullet.utils.Print.printf;

/**
 * @author brilliant
 * @author com.bullet
 * @since 15-07-2025
 * */

public class User {
    private long userID;
    private String userName;
    private String passwd;

    public User() {}

    public User(long id, String userName, String passwd) {
       this.userID = id;
       this.userName = userName;
       this.passwd = passwd;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        //printf("USER { ID= %3d, username=%-15s, password=%15s }", userID, userName, passwd);
        return "User { " +
                "userID= " + userID +
                ", userName=' " + userName + '\'' +
                ", passwd=' " + passwd + '\'' +
                '}';

    }
}
