package com.example.milestone.Respiratory;

import com.example.milestone.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRespiratory extends JpaRepository<Admin, Integer> {

        Admin findByUsername(String username);


         //static String getUsername();

        Object getPassword();

        // static String getEmail();
}
