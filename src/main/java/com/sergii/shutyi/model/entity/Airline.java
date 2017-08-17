package com.sergii.shutyi.model.entity;

import com.sergii.shutyi.dao.AirlineDAO;
import com.sergii.shutyi.dao.PlaneDAO;
import com.sergii.shutyi.model.util.AirlineUtil;
import com.sergii.shutyi.model.util.SortPlane;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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

    public Airline() {
        //build by pattern
        PlaneDAO planeDAO = new PlaneDAO();
        this.aircraftList = planeDAO.findAll();
        AirlineUtil airlineUtil = new AirlineUtil();
        this.passengerCapacity = airlineUtil.calculatePassengerCapacity(this.aircraftList);
        this.carryingCapacity = airlineUtil.calculateCarryingCapacity(this.aircraftList);
        AirlineDAO airlineDAO = new AirlineDAO();
        airlineDAO.setAirlineParameters(this);
    }

    //getter and setter
    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(ArrayList<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
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
        this.headquarters = headquarters;
    }

    public String getHubs() {
        return hubs;
    }

    public void setHubs(String hubs) {
        this.hubs = hubs;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public LocalDate getFounded() {
        return founded;
    }

    public void setFounded(LocalDate founded) {
        this.founded = founded;
    }
}
