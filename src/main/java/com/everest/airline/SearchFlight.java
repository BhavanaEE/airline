package com.everest.airline;

import java.util.ArrayList;
import java.util.List;

public class SearchFlight {
    private String source;
    private String destination;
    public SearchFlight(String source,String destination){
        this.source=source;
        this.destination=destination;
    }
    public List<Flight> searchFlight(String from, String to){
        List<Flight> flightList=new ArrayList<Flight>();
        for(Flight flight:Data.flights){
            if(flight.getSource().equalsIgnoreCase(from) && flight.getDestination().equalsIgnoreCase(to))
                flightList.add(new Flight(flight.getNumber(), flight.getSource(), flight.getDestination()));
        }
        return flightList;
    }
}
