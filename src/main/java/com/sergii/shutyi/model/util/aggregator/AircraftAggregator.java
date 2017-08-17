package com.sergii.shutyi.model.util.aggregator;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.List;
import java.util.Objects;

/**
 * Class calculates aggregated values for airline
 */
public class AircraftAggregator implements IAircraftAggregator {
    /**
     * Calculate passenger capacity of the aircraft list
     * @param aircraftList
     * @return sum of passenger capacity of all aircraft in list
     */
    public int aggregatePassengerCapacity(List<Aircraft> aircraftList) {
        Objects.requireNonNull(aircraftList);
        if (aircraftList.isEmpty()) {
            throw new IllegalArgumentException("aircraftList is empty");
        }

        int passengerCapacity = 0;
        for (Aircraft aircraft:aircraftList) {
            passengerCapacity += aircraft.getPassengerCapacity();
        }
        return passengerCapacity;
    }

    /**
     * Calculate carrying capacity of the aircraft list
     * @param aircraftList
     * @return sum of carrying capacity of all aircraft in list
     */
    public int aggregateCarryingCapacity(List<Aircraft> aircraftList) {
        Objects.requireNonNull(aircraftList);
        if (aircraftList.isEmpty()) {
            throw new IllegalArgumentException("aircraftList is empty");
        }

        int carryingCapacity = 0;
        for (Aircraft aircraft:aircraftList) {
            carryingCapacity += aircraft.getCarryingCapacity();
        }
        return carryingCapacity;
    }
}
