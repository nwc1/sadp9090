package com.example.userregistrationlogin.repository;

import com.example.userregistrationlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Make sure this method is defined
}
