package com.everest.airline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
public class SearchController {
    static List<Flight> flightList;
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/search")
    public String search(String from, String to,String departureDate, Model model){
        SearchFlight searchFlight=new SearchFlight(from,to);
        flightList=searchFlight.searchFlight(departureDate);
        model.addAttribute("flights", flightList);
        return "search";
    }

//    @RequestMapping(value = "/searchbydate")
//    public String searchbydate(String departureDate,Model model) throws ParseException {
//        SearchFlight searchFlight=new SearchFlight(departureDate);
//
//        //flightList=searchFlight.searchFlight();
//
//        flightList.stream()
//                .filter(s->(s.getDepartureDate().equals(LocalDate.parse(departureDate))))
//                .collect(Collectors.toList());
//        model.addAttribute("flights", flightList);
//        return "searchbydate";
//    }
}
