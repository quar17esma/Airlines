package com.sergii.shutyi.model.entity;

import com.sergii.shutyi.dao.PlaneDAO;
import com.sergii.shutyi.model.SortPlane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents Airline entity.
 */
public class Airline {
    /**
     * List of Aircraft of the Airline.
     */
    private List<Aircraft> aircraftList;

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
    }

    /**
     * Method sorts list of aircraft by flight range in ascend order
     * @param aircraftList list of aircraft to sort
     */
    public List<Aircraft> sortByFlightRange(){
        Collections.sort(aircraftList, SortPlane.SORT_BY_FUEL_CONSUMPTION);
        return aircraftList;
    }

    /**
     * Method finds Aircraft with fuel consumption in range.
     * @param minFuelConsumption minimal fuel consumption
     * @param maxFuelConsumption maximal fuel consumption
     * @return list of aircraft with fuel consumption in range
     */
    public ArrayList<Aircraft> findByFuelConsumptionRange(int minFuelConsumption, int maxFuelConsumption){
        return null;
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
}
