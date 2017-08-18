package com.sergii.shutyi.model.entity.airline;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Represents Airline entity.
 */
public class Airline {
    /**
     * List of Aircraft of the Airline.
     */
    private List<Aircraft> aircraftList;

    /**
     * Name of the company
     */
    private String name;

    /**
     * Headquarters of the airline
     */
    private String headquarters;

    /**
     * Hubs of the airline
     */
    private String hubs;

    /**
     * Parent company of the airline
     */
    private String parentCompany;

    /**
     * Foundation date of the airline
     */
    private LocalDate founded;

    /**
     * Passenger capacity of the Airline
     */
    private int passengerCapacity;

    /**
     * Carrying capacity of the Airline
     */
    private int carryingCapacity;


    //getter and setter
    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        this.aircraftList = Objects.requireNonNull(aircraftList);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!Objects.requireNonNull(name).isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("airline name can't be empty");
        }
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = Objects.requireNonNull(headquarters);
    }

    public String getHubs() {
        return hubs;
    }

    public void setHubs(String hubs) {
        this.hubs = Objects.requireNonNull(hubs);
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = Objects.requireNonNull(parentCompany);
    }

    public LocalDate getFounded() {
        return founded;
    }

    public void setFounded(LocalDate founded) {
        this.founded = Objects.requireNonNull(founded);
    }
}
