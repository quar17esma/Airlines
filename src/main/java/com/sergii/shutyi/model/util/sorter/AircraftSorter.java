package com.sergii.shutyi.model.util.sorter;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Class sorts aircraft list by criteria
 */
public class AircraftSorter implements IAircraftSorter {

    /**
     * Method sorts list of aircraft by fuel consumption in ascend order
     */
    public List<Aircraft> sortByFuelConsumption(List<Aircraft> aircraftList){
        Objects.requireNonNull(aircraftList);
        if (aircraftList.isEmpty()) {
            throw new IllegalArgumentException("aircraftList is empty");
        }

        Collections.sort(aircraftList, AircraftComparator.SORT_BY_FUEL_CONSUMPTION);
        return aircraftList;
    }

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    public List<Aircraft> sortByFlightRange(List<Aircraft> aircraftList){
        Objects.requireNonNull(aircraftList);
        if (aircraftList.isEmpty()) {
            throw new IllegalArgumentException("aircraftList is empty");
        }

        Collections.sort(aircraftList, AircraftComparator.SORT_BY_FLIGHT_RANGE);
        return aircraftList;
    }
}
