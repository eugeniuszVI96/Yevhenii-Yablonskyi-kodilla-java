package com.kodilla.good.patterns.airport.simple;

import java.time.LocalDateTime;

public class Time {

    private LocalDateTime departure;
    private LocalDateTime arrival;

    public Time(LocalDateTime departure, LocalDateTime arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Time time = (Time) o;

        if (!departure.equals(time.departure)) return false;
        return arrival.equals(time.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Time{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                '}';
    }
}
