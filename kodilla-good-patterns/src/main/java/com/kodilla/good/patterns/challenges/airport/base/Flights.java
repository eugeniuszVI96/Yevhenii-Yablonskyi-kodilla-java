package com.kodilla.good.patterns.challenges.airport.base;

import com.kodilla.good.patterns.challenges.airport.simple.Flight;
import com.kodilla.good.patterns.challenges.airport.simple.Time;

import java.time.LocalDateTime;

public class Flights {

    Flight flight1 = new Flight("Prague", "Oslo");
    Time time1 = new Time(
            LocalDateTime.of(2022, 3, 12, 12, 49),
            LocalDateTime.of(2022, 3, 12, 15, 30));

    Flight flight2 = new Flight("Oslo", "Berlin");
    Time time2 = new Time(
            LocalDateTime.of(2022, 3, 12, 17, 16),
            LocalDateTime.of(2022, 3, 12, 19, 50));

    Flight flight3 = new Flight("Berlin", "Prague");
    Time time3 = new Time(
            LocalDateTime.of(2022, 3, 12, 21, 15),
            LocalDateTime.of(2022, 3, 12, 23, 40));

    FlightsRepository flightsRepository = new FlightsRepository();
    flightsRepository.addFlight(flight1, time1);
    flightsRepository.addFlight(flight2, time2);
    flightsRepository.addFlight(flight3, time3);
}
