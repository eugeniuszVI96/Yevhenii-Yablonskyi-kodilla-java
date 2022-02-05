package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.simple.City;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {
        City city = new City("Oslo");

        return new FlightRequest(city);
    }


}
