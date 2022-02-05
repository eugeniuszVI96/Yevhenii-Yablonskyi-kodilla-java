package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.exception.RepositoryIsEmptyException;

public class Application {

    public static void main(String[] args) throws RepositoryIsEmptyException {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        SearchService searchService = new SearchService();
        searchService.searchFlightFrom(flightRequest);
        searchService.searchFlightTo(flightRequest);
        searchService.searchAllFlight(flightRequest);
    }
}
