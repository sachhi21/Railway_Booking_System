package com.example.milestone.Services;

import com.example.milestone.Entities.Booking;
import com.example.milestone.Entities.Train;
import com.example.milestone.Entities.User;
import com.example.milestone.Respiratory.TrainRespiratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService implements TrainDetailService {
    private final TrainRespiratory trainRepository;


    @Autowired
    public TrainService(TrainRespiratory trainRepository) {
        this.trainRepository = trainRepository;
    }


    public Train addTrain(Train train) {


        return trainRepository.save(train);
    }

    public List<Train> getAllTrains() {
        return (List<Train>) trainRepository.findAll();
    }



}
