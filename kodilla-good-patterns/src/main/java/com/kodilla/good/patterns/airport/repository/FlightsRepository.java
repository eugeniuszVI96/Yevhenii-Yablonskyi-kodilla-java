package com.kodilla.good.patterns.airport.repository;

import com.kodilla.good.patterns.airport.simple.Flight;
import com.kodilla.good.patterns.airport.simple.Time;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FlightsRepository {

    private static final Map<Integer, Flight> repository = new HashMap<>();

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
        repository.put(1111, FLIGHT_1);
        repository.put(2222, FLIGHT_2);
        repository.put(3333, FLIGHT_3);
    }

    public Map<Integer, Flight> getRepository() {
        return repository;
    }


}
