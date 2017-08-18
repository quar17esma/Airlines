package com.sergii.shutyi.model.util.sorter;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.List;

public interface IAircraftSorter {
    /**
     * Method sorts list of aircraft by fuel consumption in ascend order
     */
    List<Aircraft> sortByFuelConsumption(List<Aircraft> aircraftList);

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    List<Aircraft> sortByFlightRange(List<Aircraft> aircraftList);
}
