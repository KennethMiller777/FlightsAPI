package com.Flights.FlightsAPI.Models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flights")
public class flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flight_id; //matches flight id from flight_search table

    private String destination; //matches destination from flight_search table

    private String origin; //matches origin from flight_search table

    private Date departure_date; //matches departure_date from flight_search table

    private int passenger_count; //matches passengers from flight_search table

    //region Constructor Methods
    public void flight_search () {
        this.flight_id = 0;
        this.destination = "";
        this.origin = "";
        this.departure_date = new Date('0');
        this.passenger_count = 0;
    }

    public void flight_search (int strNewFlightID, String strNewDestination, String strNewOrigin, Date strNewDepartureDate, int strNewPassengerCount) {
        this.flight_id = strNewFlightID;
        this.destination = strNewDestination;
        this.origin = strNewOrigin;
        this.departure_date = strNewDepartureDate;
        this.passenger_count = strNewPassengerCount;
    }

    //region Getter Methods
    public int getFlightID() {
        return this.flight_id;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Date getDepartureDate() {
        return this.departure_date;
    }

    public int getPassengerCount() {
        return this.passenger_count;
    }
    //endregion Getter Methods

    //region Setter Methods
    public void setFlightID(int strNewFlightID) {
        this.flight_id = strNewFlightID;
    }

    public void setDestination(String strNewDestination) {
        this.destination = strNewDestination;
    }

    public void setOrigin(String strNewOrigin) {
        this.origin = strNewOrigin;
    }

    public void setDepartureDate(Date strNewDepartureDate) {
        this.departure_date = strNewDepartureDate;
    }

    public void setPassengerCount(int strNewPassengerCount) {
        this.passenger_count = strNewPassengerCount;
    }
    //endregion Setter Methods
}
