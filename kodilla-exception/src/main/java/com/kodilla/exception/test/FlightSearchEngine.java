package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    public String findFlight(Flight flight) throws RouteNotFoundException  {
        Map<String, Boolean> allowedAirport = new HashMap<>();
        allowedAirport.put("Moscow", true);
        allowedAirport.put("Amsterdam", true);
        allowedAirport.put("Wroclaw", false);
        allowedAirport.put("Paris", false);
        allowedAirport.put("Berlin", false);

        Boolean result = allowedAirport.get(flight.getArrivalAirport());
        if ((result != null) && (result == true)) {
            return "Flight to " + flight.getArrivalAirport() + " is allowed";
        }
        else if ((result != null) && (result == false)) {
            return "Flight to " + flight.getArrivalAirport() + " is forbidden";
        }
        else {
            throw new RouteNotFoundException("Airport not exist");
        }
    }
}
