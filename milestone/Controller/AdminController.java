package com.example.milestone.Controller;

import com.example.milestone.Entities.Admin;
import com.example.milestone.Entities.Train;
import com.example.milestone.Respiratory.AdminRespiratory;
import com.example.milestone.Respiratory.TrainRespiratory;
import com.example.milestone.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    private AdminRespiratory adminRespiratory;

    private TrainRespiratory trainRespiratory;

    @PostMapping("/create")
    public ResponseEntity<Admin> createAdmin(@RequestBody AdminRespiratory adminRespiratory) {
        Admin createdAdmin = adminService.createAdmin(adminRespiratory);
        return ResponseEntity.ok(createdAdmin);
    }


    @PostMapping
    public Train addTrain(Train train){

        return trainRespiratory.save(train);
    }
}
