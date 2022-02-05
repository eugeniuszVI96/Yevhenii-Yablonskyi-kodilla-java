package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.exception.RepositoryIsEmptyException;
import com.kodilla.good.patterns.airport.repository.FlightsRepository;
import com.kodilla.good.patterns.airport.simple.Flight;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchService {

    private static final FlightsRepository FLIGHTS_REPOSITORY = new FlightsRepository();

    public void searchFlightTo(FlightRequest fightRequest) throws RepositoryIsEmptyException {
        Map<Integer, Flight> found = FLIGHTS_REPOSITORY.getRepository().entrySet().stream()
                .filter(flight -> flight.getValue().getTo().equals(fightRequest.getName()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (found.isEmpty()) {
            throw new RepositoryIsEmptyException("Didn't find any flight");
        }
    }

    public void searchFlightFrom(FlightRequest fightRequest) throws RepositoryIsEmptyException {
        Map<Integer, Flight> found = FLIGHTS_REPOSITORY.getRepository().entrySet().stream()
                .filter(flight -> flight.getValue().getFrom().equals(fightRequest.getName()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (found.isEmpty()) {
            throw new RepositoryIsEmptyException("Didn't find any flight");
        }
    }

    public void searchAllFlight(FlightRequest fightRequest) throws RepositoryIsEmptyException {
        Map<Integer, Flight> found = FLIGHTS_REPOSITORY.getRepository().entrySet().stream()
                .filter(flight -> flight.getValue().getTo().equals(fightRequest.getName()))
                .filter(flight -> flight.getValue().getFrom().equals(fightRequest.getName()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (found.isEmpty()) {
            throw new RepositoryIsEmptyException("Didn't find any flight");
        }
    }
}
