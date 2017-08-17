package com.sergii.shutyi.model.util;

import com.sergii.shutyi.model.entity.Aircraft;

import java.util.Collections;
import java.util.List;

public class AircraftSorter {

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    public List<Aircraft> sortByFuelConsumption(List<Aircraft> aircraftList){
        Collections.sort(aircraftList, AircraftComparator.SORT_BY_FUEL_CONSUMPTION);
        return aircraftList;
    }

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    public List<Aircraft> sortByFlightRange(List<Aircraft> aircraftList){
        Collections.sort(aircraftList, AircraftComparator.SORT_BY_FLIGHT_RANGE);
        return aircraftList;
    }
}
