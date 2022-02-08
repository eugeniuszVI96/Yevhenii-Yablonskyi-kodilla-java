package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.exception.RepositoryIsEmptyException;
import com.kodilla.good.patterns.airport.repository.FlightsRepository;

public class Application {

    public static void main(String[] args) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightsRepository flightsRepository = new FlightsRepository();
        SearchService searchService = new SearchService(flightsRepository);
        searchService.searchFlightFrom(flightRequest);
        searchService.searchFlightTo(flightRequest);
        searchService.searchAllFlight(flightRequest);
    }
}
