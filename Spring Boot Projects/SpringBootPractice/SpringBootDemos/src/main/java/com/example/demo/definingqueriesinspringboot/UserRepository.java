package com.example.demo.definingqueriesinspringboot;

// src/main/java/com/example/demo/UserRepository.java


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Query derived from method name
    List<User> findByName(String name);

    // Using @Query annotation with JPQL
    @Query("SELECT u FROM User u WHERE u.email = :email")
    User findByEmail(@Param("email") String email);

    // Using @Query annotation with native SQL
    @Query(value = "SELECT * FROM User u WHERE u.email = :email", nativeQuery = true)
    User findUserByEmailNative(@Param("email") String email);
}
