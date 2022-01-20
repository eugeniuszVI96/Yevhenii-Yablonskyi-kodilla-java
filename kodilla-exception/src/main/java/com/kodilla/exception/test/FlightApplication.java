package com.kodilla.exception.test;

public class FlightApplication {

    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Warsaw", "Amsterdam");
        Flight flight2 = new Flight( "Warsaw","Berlin");
        Flight flight3 = new Flight("Warsaw", "New York");

        FlightManagement flightManagement = new FlightManagement();
        flightManagement.add("Amsterdam", true);
        flightManagement.add("Berlin", false);

        try {
            flightManagement.findFlight(flight3);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}

