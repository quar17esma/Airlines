package com.sergii.shutyi.model.util.aggregator;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.List;

public interface IAircraftAggregator {
    /**
     * Calculate passenger capacity of the aircraft list
     * @param aircraftList
     * @return sum of passenger capacity of all aircraft in list
     */
    int aggregatePassengerCapacity(List<Aircraft> aircraftList);

    /**
     * Calculate carrying capacity of the aircraft list
     * @param aircraftList
     * @return sum of carrying capacity of all aircraft in list
     */
    int aggregateCarryingCapacity(List<Aircraft> aircraftList);
}
