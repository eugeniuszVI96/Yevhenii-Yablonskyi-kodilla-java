package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightManagement {

    private Map<String, Boolean> allowedAirports = new HashMap<>();

    public Map<String, Boolean> getAllowedAirports() {
        return allowedAirports;
    }

    public void setAllowedAirports(Map<String, Boolean> allowedAirports) {
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

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Boolean result = allowedAirports.get(flight.getArrivalAirport());
        if (result == null) {
            throw new RouteNotFoundException("Airport not exist");
        }
        else if (result) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is allowed");
        }
        else {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is forbidden");
        }
    }

    public void add(String airport, boolean permission) {
        allowedAirports.put(airport, permission);
    }
}
