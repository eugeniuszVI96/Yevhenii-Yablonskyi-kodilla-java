package com.kodilla.good.patterns.challenges.airport.interfaces;

import com.kodilla.good.patterns.challenges.airport.simple.Flight;
import com.kodilla.good.patterns.challenges.airport.simple.Time;

public interface FlightService {

    void addFlight(Flight flight, Time flightTime);
}
