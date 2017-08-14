package com.sergii.shutyi.model.entity;

import java.util.ArrayList;

/**
 * Represents Airline entity.
 */
public class Airline {
    /**
     * List of Aircraft of the Airline.
     */
    private ArrayList<Aircraft> aircraftList = new ArrayList<>();

    /**
     * Passenger capacity of the Airline
     */
    private int passengerCapacity;

    /**
     * Carrying capacity of the Airline
     */
    private int carryingCapacity;

    /**
     * Method sorts list of aircraft by flight range in ascend order
     * @param aircraftList list of aircraft to sort
     */
    public void sortByFlightRange(ArrayList<Aircraft> aircraftList){
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
    public ArrayList<Aircraft> getAircraftList() {
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
