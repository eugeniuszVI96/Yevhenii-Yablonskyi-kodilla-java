package com.kodilla.good.patterns.airport;

public class FlightRequest {

    private final String city;

    public FlightRequest(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightRequest that = (FlightRequest) o;

        return city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }

    @Override
    public String toString() {
        return "FlightRequest{" +
                "city='" + city + '\'' +
                '}';
    }
}
