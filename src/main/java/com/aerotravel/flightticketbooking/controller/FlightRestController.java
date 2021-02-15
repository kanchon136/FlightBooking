/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aerotravel.flightticketbooking.controller;

import com.aerotravel.flightticketbooking.model.Airport;
import com.aerotravel.flightticketbooking.model.Passenger;
import com.aerotravel.flightticketbooking.services.AircraftService;
import com.aerotravel.flightticketbooking.services.AirportService;
import com.aerotravel.flightticketbooking.services.FlightService;
import com.aerotravel.flightticketbooking.services.PassengerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JEE
 */
@RestController()
public class FlightRestController {
    @Autowired
    AirportService airportservice;
    
    @Autowired
    PassengerService passengerservice;
    
    @Autowired
    AircraftService aircraftservice;
    
    @Autowired
    FlightService flightservice;
    
    @RequestMapping(method = RequestMethod.GET, value = "/api/airports")
    public ResponseEntity<List<Airport>> getAirport(){
       return new ResponseEntity<>(airportservice.getAllAirports(),HttpStatus.OK);
    }
    
    @GetMapping(path = "/api/passenger")
    public ResponseEntity<List<Passenger>> getPassenger(){
       return new ResponseEntity<>(passengerservice.getAllPassengers(),HttpStatus.OK);
    }
    
    
    
}
