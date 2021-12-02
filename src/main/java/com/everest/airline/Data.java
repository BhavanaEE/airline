package com.everest.airline;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Data {

    static List<Flight> flights = List.of(
            new Flight(1001, "Hyderabad", "Bangalore", LocalDate.of(2022,1,01),"6:54"),
            new Flight(1002, "Bangalore", "Hyderabad",LocalDate.of(2022,1,01),"9:56"),
            new Flight(1003, "Goa", "Bangalore",LocalDate.of(2021,12,21),"3:23"),
            new Flight(1004, "Bangalore", "Goa",LocalDate.of(2021,12,11),"7:54"),
            new Flight(1005, "Bangalore", "Hyderabad",LocalDate.of(2022,1,01),"1:30"),
            new Flight(1006, "Hyderabad", "Bangalore",LocalDate.of(2022,1,02),"4:40"));

}