package com.pack.springapp.Service;

import java.util.ArrayList;
import java.util.List;

import com.pack.springapp.Model.User;
import com.pack.springapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userrepo;

    //listing all users
    public List <User> getAllUsers()
    {
        List <User> users=new ArrayList<User>();

        userrepo.findAll().forEach(user -> users.add(user));
        return users;
    }

    //listing sprcific user record

    public User getUserById(int id)
    {

        return userrepo.findById(id).get();

    }
    //save or update
    public void saveOrUpdate(User  user)
    {

        userrepo.save(user);
    }
    //delete a specific record

    public void delete(int id)
    {

        userrepo.deleteById(id);
    }
}