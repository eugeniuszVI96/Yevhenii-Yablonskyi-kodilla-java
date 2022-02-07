package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.exception.RepositoryIsEmptyException;
import com.kodilla.good.patterns.airport.repository.FlightsRepository;
import com.kodilla.good.patterns.airport.simple.Flight;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchService {

    private final FlightsRepository flightsRepository = new FlightsRepository();

    public void searchFlightTo(FlightRequest fightRequest) {
        Map<Integer, Flight> found = flightsRepository.getFlights().entrySet().stream()
                .filter(flight -> flight.getValue().getTo().equals(fightRequest.getCity()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void searchFlightFrom(FlightRequest fightRequest) {
        Map<Integer, Flight> found = flightsRepository.getFlights().entrySet().stream()
                .filter(flight -> flight.getValue().getFrom().equals(fightRequest.getCity()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void searchAllFlight(FlightRequest fightRequest) {
        Map<Integer, Flight> found = flightsRepository.getFlights().entrySet().stream()
                .filter(flight -> flight.getValue().getTo().equals(fightRequest.getCity()) || flight.getValue().getFrom().equals(fightRequest.getCity()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
