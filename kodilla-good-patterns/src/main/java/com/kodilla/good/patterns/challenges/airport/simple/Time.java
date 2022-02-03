package com.kodilla.good.patterns.challenges.airport.simple;

import java.time.LocalDateTime;

public class Time {

    private LocalDateTime departure;
    private LocalDateTime arrival;

    public Time(LocalDateTime departure, LocalDateTime arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
}
