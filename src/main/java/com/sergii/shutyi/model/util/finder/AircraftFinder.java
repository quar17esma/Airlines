package com.sergii.shutyi.model.util.finder;

import com.sergii.shutyi.model.entity.Aircraft;

import java.util.ArrayList;
import java.util.List;

/**
 * Class finds aircraft depends on criteria
 */
public class AircraftFinder {
    /**
     * Method finds all aircraft with fuel consumption in range.
     * @param minFuelConsumption minimal fuel consumption
     * @param maxFuelConsumption maximal fuel consumption
     * @return list of aircraft with fuel consumption in range
     */
    public List<Aircraft> findByFuelConsumptionRange(List<Aircraft> aircraftList, int minFuelConsumption, int maxFuelConsumption){
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

    /**
     * Returns {@code true} if actual fuel consumption is in range.(barriers included)
     * @param actual actual fuel consumption
     * @param min minimal fuel consumption
     * @param max maximal fuel consumption
     * @return true if actual fuel consumption is in range.
     */
    private boolean isBetweenFuelConsumption(int actual, int min, int max) {
        if (actual <= 0 || min < 0 || max <= 0) {
            throw new IllegalArgumentException("Fuel consumption can not be negative or equals zero");
        } else if (min > max) {
            throw new IllegalArgumentException("min can not be greater than max");
        } else {
            if (actual >= min && actual <= max) {
                return true;
            }
        }
        return false;
    }
}
