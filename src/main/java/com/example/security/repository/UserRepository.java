package com.example.security.repository;

import com.example.security.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository("userRepository")
public interface UserRepository extends JpaRepository <User, Integer> {
    User findByEmail(String email);
}
