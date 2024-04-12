package com.Flights.FlightsAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Flights.FlightsAPI.Models.flight;

public interface flightrepository extends JpaRepository<flight, Long>{}
