package com.example.milestone.Services;

import com.example.milestone.Entities.Booking;
import com.example.milestone.Entities.Train;
import com.example.milestone.Entities.User;
import com.example.milestone.Respiratory.BookingRespiratory;
import com.example.milestone.Respiratory.TrainRespiratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements BookinDetailService{
    private static BookingRespiratory bookingRepository ;

    private TrainRespiratory trainRespiratory;

    @Autowired
    public BookingService(BookingRespiratory bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


       public List<Booking> getUserBookings(User user) {
        return bookingRepository.findByUser(user);
    }


}
