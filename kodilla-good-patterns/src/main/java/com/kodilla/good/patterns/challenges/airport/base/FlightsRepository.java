package com.kodilla.good.patterns.challenges.airport.base;

import com.kodilla.good.patterns.challenges.airport.exception.BaseIsEmptyException;
import com.kodilla.good.patterns.challenges.airport.interfaces.FlightService;
import com.kodilla.good.patterns.challenges.airport.simple.Flight;
import com.kodilla.good.patterns.challenges.airport.simple.Time;

import java.util.HashMap;
import java.util.Map;

public class FlightsRepository implements FlightService {

    private Map<Flight, Time> repository = new HashMap<>();

    public void addFlight(Flight flight, Time flightTime) {
        repository.put(flight, flightTime);
    }

    public Map<Flight, Time> getBase() throws BaseIsEmptyException {
        if (repository.isEmpty()) {
            throw new BaseIsEmptyException("Base is empty");
        }
        else {
            return repository;
        }
    }
}
