package com.example.milestone.Services;

import com.example.milestone.Entities.Admin;
import com.example.milestone.Entities.Train;
import com.example.milestone.Respiratory.AdminRespiratory;

public interface AdminDetailService {

    Train addTrain(Train train);

    Admin createAdmin(AdminRespiratory adminRespiratory);

}
