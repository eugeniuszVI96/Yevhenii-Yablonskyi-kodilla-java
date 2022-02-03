package com.kodilla.good.patterns.challenges.airport.base;

import com.kodilla.good.patterns.challenges.airport.exception.BaseIsEmptyException;
import com.kodilla.good.patterns.challenges.airport.interfaces.FlightService;
import com.kodilla.good.patterns.challenges.airport.simple.Flight;
import com.kodilla.good.patterns.challenges.airport.simple.Time;

import java.util.HashMap;
import java.util.Map;

public class FlightBase implements FlightService {

    private Map<Time, Flight> base = new HashMap<>();

    public void addFlight(Flight flight, Time flightTime) {
        base.put(flightTime, flight);
    }

    public Map<Time, Flight> getBase() throws BaseIsEmptyException {
        if (base.isEmpty()) {
            throw new BaseIsEmptyException("Base is empty");
        }
        else {
            return base;
        }
    }
}
