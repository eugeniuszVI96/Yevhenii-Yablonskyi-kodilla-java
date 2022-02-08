package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.exception.RepositoryIsEmptyException;
import com.kodilla.good.patterns.airport.repository.FlightsRepository;
import com.kodilla.good.patterns.airport.simple.Flight;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchService {

    private final FlightsRepository flightsRepository;

    public SearchService(FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public FlightsRepository getFlightsRepository() {
        return flightsRepository;
    }

    public Map<Integer, Flight> searchFlightTo(FlightRequest fightRequest) {
        Map<Integer, Flight> found = flightsRepository.getFlights().entrySet().stream()
                .filter(flight -> flight.getValue().getTo().equals(fightRequest.getCity()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return found;
    }

    public Map<Integer, Flight> searchFlightFrom(FlightRequest fightRequest) {
        Map<Integer, Flight> found = flightsRepository.getFlights().entrySet().stream()
                .filter(flight -> flight.getValue().getFrom().equals(fightRequest.getCity()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return found;
    }

    public Map<Integer, Flight> searchAllFlight(FlightRequest fightRequest) {
        Map<Integer, Flight> found = flightsRepository.getFlights().entrySet().stream()
                .filter(flight -> flight.getValue().getTo().equals(fightRequest.getCity()) || flight.getValue().getFrom().equals(fightRequest.getCity()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return found;
    }
}
