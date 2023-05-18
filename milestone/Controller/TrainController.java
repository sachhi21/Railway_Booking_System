package com.example.milestone.Controller;

import com.example.milestone.Entities.Train;
import com.example.milestone.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {
    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @PostMapping("/add")
    public Train addTrain(@RequestBody Train train) {
        Train addedTrain = trainService.addTrain(train);
        return addedTrain;
    }

    @GetMapping("/all")
    public List<Train> getAllTrains() {
        List<Train> trains = trainService.getAllTrains();
        return (trains);
    }

    // Other train-related endpoints
}
