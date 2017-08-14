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

    //getter and setter
    public ArrayList<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(ArrayList<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }
}
