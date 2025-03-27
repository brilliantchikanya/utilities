package com.bullet.user;

public interface UserInterface {
    User login();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}
