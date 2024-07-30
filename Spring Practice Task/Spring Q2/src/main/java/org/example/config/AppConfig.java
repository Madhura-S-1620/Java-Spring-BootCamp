package org.example.config;
import org.example.booking.Booking;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages = "org.example")

public class AppConfig {

    @Bean
    public Booking booking() {
        Booking booking = new Booking();
        booking.setBusId(1010);
        booking.setBusName("Swami Travels");
        booking.setBusDeparture("Swargate");
        booking.setBusDestination("Banglore");
        booking.setJourneyDate(LocalDate.of(2024, 7, 12));
        return booking;
    }
}
