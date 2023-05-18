package com.example.milestone.Respiratory;


import com.example.milestone.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String username);

    String getUsername();

    CharSequence getPassword();

    String getEmail();

    User findByUsername(String username);
}
