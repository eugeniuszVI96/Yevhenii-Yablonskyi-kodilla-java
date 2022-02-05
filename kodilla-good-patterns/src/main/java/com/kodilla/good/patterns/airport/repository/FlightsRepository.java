package com.kodilla.good.patterns.airport.repository;

import com.kodilla.good.patterns.airport.simple.Flight;

import java.util.HashMap;
import java.util.Map;

public class FlightsRepository {

    private final Map<Integer, Flight> repository = new HashMap<>();

    public void addFlight(Integer code, Flight flight) {
        repository.put(code, flight);
    }

    public Map<Integer, Flight> getRepository() {
        return repository;
    }
}
