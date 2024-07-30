package org.example.service;

import org.example.booking.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private Booking booking;

    public void displayBookingDetails() {
        System.out.println("Booking details are:");
        System.out.println("Bus id = " + booking.getBusId());
        System.out.println("Bus Name = " + booking.getBusName());
        System.out.println("Bus departure = " + booking.getBusDeparture());
        System.out.println("Bus destination = " + booking.getBusDestination());
        System.out.println("Journey date = " + booking.getJourneyDate());
    }
}
