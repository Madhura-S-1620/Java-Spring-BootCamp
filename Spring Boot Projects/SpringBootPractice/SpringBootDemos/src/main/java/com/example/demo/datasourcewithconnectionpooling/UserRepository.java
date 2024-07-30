package com.example.demo.datasourcewithconnectionpooling;

// src/main/java/com/example/demo/UserRepository.java


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
