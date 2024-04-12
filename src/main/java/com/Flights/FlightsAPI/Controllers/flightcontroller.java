package com.Flights.FlightsAPI.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Flights.FlightsAPI.Models.*;
import com.Flights.FlightsAPI.Repositories.*;

@RestController
@RequestMapping("/api/flights")
public class flightcontroller {
    @Autowired
    private flightrepository repo;

    @GetMapping
    public List<flight> findAllFlights () { //default api endpoint to get all flights
        return repo.findAll();
    }

    @GetMapping("/{id}") //api endpoint to get flight by id
    public ResponseEntity<flight> findFlightByID (@PathVariable(value = "id") long id) {
        Optional<flight> flights = repo.findById(id);

        if(flights.isPresent()) {
            return ResponseEntity.ok().body(flights.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping //api endpoint to save flight to database
    public flight saveFlight (@Validated @RequestBody flight f) {
        return repo.save(f);
    }
}