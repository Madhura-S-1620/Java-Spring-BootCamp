package org.example.booking;
import java.time.LocalDate;

public class Booking {

    private int busId;
    private String busName;
    private String busDeparture;
    private String busDestination;
    private LocalDate journeyDate;

    // Getters and setters

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusDeparture() {
        return busDeparture;
    }

    public void setBusDeparture(String busDeparture) {
        this.busDeparture = busDeparture;
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(LocalDate journeyDate) {
        this.journeyDate = journeyDate;
    }
}

