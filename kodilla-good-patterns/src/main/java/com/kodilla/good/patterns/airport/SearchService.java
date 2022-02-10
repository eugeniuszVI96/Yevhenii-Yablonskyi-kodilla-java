package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.exception.RepositoryIsEmptyException;
import com.kodilla.good.patterns.airport.repository.FlightsRepository;
import com.kodilla.good.patterns.airport.simple.Flight;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchService {

    private final FlightsRepository flightsRepository;

    public SearchService(FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public FlightsRepository getFlightsRepository() {
        return flightsRepository;
    }

    public List<Flight> searchFlightsTo(FlightRequest fightRequest) {
        List<Flight> found = flightsRepository.getFlights().stream()
                .filter(flight -> flight.getTo().equals(fightRequest.getCity()))
                .collect(Collectors.toList());
        return found;
    }

    public List<Flight> searchFlightsFrom(FlightRequest fightRequest) {
        List<Flight> found = flightsRepository.getFlights().stream()
                .filter(flight -> flight.getFrom().equals(fightRequest.getCity()))
                .collect(Collectors.toList());
        return found;
    }

    public List<Flight> searchFlightsVia(FlightRequest fightRequest) {
        List<Flight> from = searchFlightsTo(fightRequest);
        List<Flight> to = searchFlightsFrom(fightRequest);
        List<Flight> found = Stream.concat(from.stream(), to.stream())
                .collect(Collectors.toList());
        return found;
    }
}
