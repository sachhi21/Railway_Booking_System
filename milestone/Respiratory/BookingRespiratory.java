package com.example.milestone.Respiratory;

import com.example.milestone.Entities.Booking;
import com.example.milestone.Entities.Train;
import com.example.milestone.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRespiratory extends JpaRepository<Booking,Integer> {




    List<Booking> findByUser(User user);

   // List<Booking> findByTrainAndBookingDate(Train train, LocalDate bookingDate);
}
