package com.example.milestone.Services;

import com.example.milestone.Entities.Booking;
import com.example.milestone.Entities.Train;
import com.example.milestone.Entities.User;

import java.util.List;

public interface TrainDetailService {



    Train addTrain(Train train);

    List<Train> getAllTrains();
}
