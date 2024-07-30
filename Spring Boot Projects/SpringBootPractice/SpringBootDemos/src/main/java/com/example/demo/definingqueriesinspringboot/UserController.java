package com.example.demo.definingqueriesinspringboot;

// src/main/java/com/example/demo/UserController.java


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users/by-name")
    public List<User> getUsersByName(@RequestParam String name) {
        return userRepository.findByName(name);
    }

    @GetMapping("/users/by-email")
    public User getUserByEmail(@RequestParam String email) {
        return userRepository.findByEmail(email);
    }

    @GetMapping("/users/by-email-native")
    public User getUserByEmailNative(@RequestParam String email) {
        return userRepository.findUserByEmailNative(email);
    }
}
