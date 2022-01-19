package com.kodilla.exception.test;

public class FlightApplication {

    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Paris", "Amsterdam");
        Flight flight2 = new Flight( "Moscow","Berlin");
        Flight flight3 = new Flight("Wroclaw", "New York");
        FlightSearchEngine search = new FlightSearchEngine();
        String result = "";

        try {
            result = search.findFlight(flight1);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        finally {
            System.out.println(result);
        }
    }
}
