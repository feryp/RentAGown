package com.example.rentagown.Model;

public class NoAvailableDate {
    private String startDateBooking;
    private String endDateBooking;

    public NoAvailableDate(String startDateBooking, String endDateBooking) {
        this.startDateBooking = startDateBooking;
        this.endDateBooking = endDateBooking;
    }

    public String getStartDateBooking() {
        return startDateBooking;
    }

    public void setStartDateBooking(String startDateBooking) {
        this.startDateBooking = startDateBooking;
    }

    public String getEndDateBooking() {
        return endDateBooking;
    }

    public void setEndDateBooking(String endDateBooking) {
        this.endDateBooking = endDateBooking;
    }
}
