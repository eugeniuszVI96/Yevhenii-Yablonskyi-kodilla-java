package com.kodilla.good.patterns.airport.repository;

import com.kodilla.good.patterns.airport.simple.Flight;
import com.kodilla.good.patterns.airport.simple.Time;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsRepository {

    private static final List<Flight> FLIGHTS = new ArrayList<>();

    private static final Flight FLIGHT_1 = new Flight(
            "Prague", "Oslo",
            new Time(
                    LocalDateTime.of(2022, 3, 13, 12, 15),
                    LocalDateTime.of(2022, 3, 13, 15, 15)));
    private static final Flight FLIGHT_2 = new Flight(
            "Oslo", "Berlin",
            new Time(
                    LocalDateTime.of(2022, 3, 12, 17, 16),
                    LocalDateTime.of(2022, 3, 12, 19, 50)));
    private static final Flight FLIGHT_3 = new Flight(
            "Berlin", "Prague",
            new Time(
                    LocalDateTime.of(2022, 3, 12, 21, 15),
                    LocalDateTime.of(2022, 3, 12, 23, 40)));

    static {
        FLIGHTS.add(FLIGHT_1);
        FLIGHTS.add(FLIGHT_2);
        FLIGHTS.add(FLIGHT_3);
    }

    public List<Flight> getFlights() {
        return FLIGHTS;
    }


}
