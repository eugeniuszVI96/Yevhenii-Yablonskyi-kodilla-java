package com.kodilla.good.patterns.airport;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {
        String city = new String("Oslo");

        return new FlightRequest(city);
    }


}
