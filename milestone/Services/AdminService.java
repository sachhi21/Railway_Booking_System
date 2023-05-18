package com.example.milestone.Services;

import com.example.milestone.Entities.Admin;
import com.example.milestone.Entities.Train;
import com.example.milestone.Respiratory.AdminRespiratory;
import com.example.milestone.Respiratory.TrainRespiratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AdminService implements  AdminDetailService {
    private final AdminRespiratory adminRepository;
    private  TrainRespiratory trainRespiratory;

    @Autowired
    public AdminService(AdminRespiratory adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(AdminRespiratory adminRespiratory) {
        Admin admin = new Admin();
      //  admin.setUsername(AdminRespiratory.getUsername());
      //  admin.setPassword(PasswordEncoder.encode(adminRespiratory.getPassword()));
       // admin.setEmail(AdminRespiratory.getEmail());


        return adminRepository.save(admin);
    }



    @Override
    public Train addTrain(Train train) {
        return trainRespiratory.save(train);
    }

}
