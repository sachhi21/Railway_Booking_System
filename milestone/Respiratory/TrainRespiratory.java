package com.example.milestone.Respiratory;

import com.example.milestone.Entities.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRespiratory extends JpaRepository<Train, Integer> {

    List<Train> findBySourceAndDestinationAndClassesContaining(String source, String destination, String classType);
}
