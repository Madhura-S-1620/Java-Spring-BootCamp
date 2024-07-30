package com.pack.daoimpl;

import com.pack.entity.User;

import java.util.*;
public interface UserdaoImpl {
    public List <User> getAllUsers();
    public User getUser(int id);

    public void updateUser(User user);
    public void deleteUser(User user);


}