package com.example.milestone.Controller;

import com.example.milestone.Entities.Booking;
import com.example.milestone.Entities.Train;
import com.example.milestone.Entities.User;
import com.example.milestone.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")


    @GetMapping("/user/{username}")
    public List<Booking> getUserBookings(@RequestParam User username) {

        return bookingService.getUserBookings(username);
    }

}

