package com.kodilla.exception.test.flight;

import java.util.HashMap;
import java.util.Map;

public class FlightApplication {

    public static void main(String[] args) throws RouteNotFoundException {
        Flight one = new Flight("Warsaw", "Amsterdam");
        Flight two = new Flight( "Warsaw","Berlin");
        Flight three = new Flight("Warsaw", "New York");

        Map<String, Boolean> allowedAirports = new HashMap<>();
        allowedAirports.put("Amsterdam", true);
        allowedAirports.put("Berlin", false);

        FlightManagement flightManagement = new FlightManagement(allowedAirports);

        Flight number = three;
        try {
            flightManagement.findFlight(number);
            flightManagement.print(number);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}

