package com.everest.airline;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {
    private String source;
    private String destination;
    private String departureDate;
    public SearchFlight(String source,String destination){
        this.source=source;
        this.destination=destination;
    }
    public List<Flight> searchFlight(String departureDate){
        return Data.flights.stream()
                .filter(s->(s.getSource().equalsIgnoreCase(source) && s.getDestination().equalsIgnoreCase(destination)) && s.getDepartureDate().equals(LocalDate.parse(departureDate)))
                .collect(Collectors.toList());
    }
}
