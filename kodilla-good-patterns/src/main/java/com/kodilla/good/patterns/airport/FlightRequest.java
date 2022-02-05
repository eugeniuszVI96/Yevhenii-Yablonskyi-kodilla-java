package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.simple.City;

public class FlightRequest {

    private final City name;

    public FlightRequest(City name) {
        this.name = name;
    }

    public String getName() {
        return name.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightRequest that = (FlightRequest) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "FlightRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
