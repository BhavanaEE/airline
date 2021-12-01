package com.everest.airline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/arrivalTime")
    public String arrivalTime() {
        return "arrivalTime";
    }

    @RequestMapping(value = "/search")
    public String search(String from, String to, Model model) {
        SearchFlight searchFlight=new SearchFlight(from,to);
        List<Flight> flightList=searchFlight.searchFlight(from,to);
        model.addAttribute("flights", flightList);
        return "search";
    }
}
