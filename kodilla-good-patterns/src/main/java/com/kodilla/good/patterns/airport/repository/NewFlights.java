package com.kodilla.good.patterns.airport.repository;

import com.kodilla.good.patterns.airport.simple.Flight;
import com.kodilla.good.patterns.airport.simple.Time;

import java.time.LocalDateTime;

public class NewFlights {

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
        FlightsRepository flightsRepository = new FlightsRepository();
        flightsRepository.addFlight(1111, FLIGHT_1);
        flightsRepository.addFlight(2222, FLIGHT_2);
        flightsRepository.addFlight(3333, FLIGHT_3);
    }
}
