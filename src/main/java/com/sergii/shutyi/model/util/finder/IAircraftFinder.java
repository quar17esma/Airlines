package com.sergii.shutyi.model.util.finder;

import com.sergii.shutyi.controller.exceptions.IllegalFuelConsumptionRange;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.List;

public interface IAircraftFinder {
    /**
     * Method finds all aircraft with fuel consumption in range.
     *
     * @param minFuelConsumption minimal fuel consumption
     * @param maxFuelConsumption maximal fuel consumption
     * @return list of aircraft with fuel consumption in range
     */
    List<Aircraft> findByFuelConsumptionRange(List<Aircraft> aircraftList, int minFuelConsumption, int maxFuelConsumption)
            throws IllegalFuelConsumptionRange;
}
