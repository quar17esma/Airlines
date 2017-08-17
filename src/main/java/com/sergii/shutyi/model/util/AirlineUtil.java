package com.sergii.shutyi.model.util;

import com.sergii.shutyi.model.entity.Aircraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirlineUtil {
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
    public List<Aircraft> sortByFuelConsumption(List<Aircraft> aircraftList){
        Collections.sort(aircraftList, SortPlane.SORT_BY_FUEL_CONSUMPTION);
        return aircraftList;
    }

    /**
     * Method sorts list of aircraft by flight range in ascend order
     */
    public List<Aircraft> sortByFlightRange(List<Aircraft> aircraftList){
        Collections.sort(aircraftList, SortPlane.SORT_BY_FLIGHT_RANGE);
        return aircraftList;
    }

    /**
     * Method finds Aircraft with fuel consumption in range.
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
}
