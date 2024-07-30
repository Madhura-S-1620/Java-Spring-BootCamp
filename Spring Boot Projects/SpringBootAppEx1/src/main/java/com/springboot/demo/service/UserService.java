package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.springboot.demo.model.User;
import com.springboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    // Listing all users
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }

    // Listing specific user record
    public User getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    // Save or update
    public void saveOrUpdate(User user) {
        userRepo.save(user);
    }

    // Delete a specific record
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
