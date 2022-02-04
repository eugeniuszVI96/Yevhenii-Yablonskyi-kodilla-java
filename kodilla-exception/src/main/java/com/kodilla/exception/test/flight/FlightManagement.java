package com.kodilla.exception.test.flight;

import java.util.Map;

public class FlightManagement {

    private Map<String, Boolean> allowedAirports;

    public FlightManagement(Map<String, Boolean> allowedAirports) {
        this.allowedAirports = allowedAirports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightManagement that = (FlightManagement) o;

        return allowedAirports.equals(that.allowedAirports);
    }

    @Override
    public int hashCode() {
        return allowedAirports.hashCode();
    }

    @Override
    public String toString() {
        return "FlightSearchEngine{" +
                "allowedAirports=" + allowedAirports +
                '}';
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Boolean result = allowedAirports.get(flight.getArrivalAirport());
        if (result == null) {
            throw new RouteNotFoundException("Airport not exist");
        }
        else return result;
    }

    public void print(Flight flight) {
        Boolean result = allowedAirports.get(flight.getArrivalAirport());
        if (result) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is allowed ");
        }
        else {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is forbidden ");
        }
    }
}
