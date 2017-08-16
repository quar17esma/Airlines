package com.sergii.shutyi.model.entity;

import com.sergii.shutyi.dao.AirlineDAO;
import com.sergii.shutyi.dao.PlaneDAO;
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

    private String name;

    private String headquarters;

    private String hubs;

    private String parentCompany;

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
        PlaneDAO planeDAO = new PlaneDAO();
        this.aircraftList = planeDAO.findAll();
        this.passengerCapacity = calculatePassengerCapacity(this.aircraftList);
        this.carryingCapacity = calculateCarryingCapacity(this.aircraftList);
        AirlineDAO airlineDAO = new AirlineDAO();
        airlineDAO.setAirlineParameters(this);
    }

    public int calculatePassengerCapacity(List<Aircraft> aircraftList) {
        int passengerCapacity = 0;
        for (Aircraft aircraft:aircraftList) {
            passengerCapacity += aircraft.getPassengerCapacity();
        }
        return passengerCapacity;
    }

    public int calculateCarryingCapacity(List<Aircraft> aircraftList) {
        int carryingCapacity = 0;
        for (Aircraft aircraft:aircraftList) {
            carryingCapacity += aircraft.getCarryingCapacity();
        }
        return carryingCapacity;
    }

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    public List<Aircraft> sortByFuelConsumption(){
        Collections.sort(aircraftList, SortPlane.SORT_BY_FUEL_CONSUMPTION);
        return aircraftList;
    }

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    public List<Aircraft> sortByFlightRange(){
        Collections.sort(aircraftList, SortPlane.SORT_BY_FLIGHT_RANGE);
        return aircraftList;
    }

    /**
     * Method finds Aircraft with fuel consumption in range.
     * @param minFuelConsumption minimal fuel consumption
     * @param maxFuelConsumption maximal fuel consumption
     * @return list of aircraft with fuel consumption in range
     */
    public List<Aircraft> findByFuelConsumptionRange(int minFuelConsumption, int maxFuelConsumption){
        List<Aircraft> aircraftInRangeList = new ArrayList<>();
        for (Aircraft aircraft:aircraftList) {
            if (isBetweenFuelConsumption(aircraft.getFuelConsumption(), minFuelConsumption, maxFuelConsumption)) {
                aircraftInRangeList.add(aircraft);
            }
        }

        if (aircraftInRangeList.isEmpty()) {
            //Exception not found in range
        }

        return aircraftInRangeList;
    }

    private boolean isBetweenFuelConsumption(int actual, int min, int max) {
        if (actual <= 0 || min < 0 || max <= 0) {
            throw new IllegalArgumentException("Fuel consumption can not be negative or equals zero");
        } else if (min > max) {
            throw new IllegalArgumentException("min can not be greater than max");
        } else {
            if (actual > min && actual < max) {
                return true;
            }
        }
        return false;
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
