package com.sergii.shutyi.model.util.sorter;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.Comparator;

/**
 * Class gives aircraft comparators by criteria
 */
public class AircraftComparator {

    public static Comparator<Aircraft> SORT_BY_FUEL_CONSUMPTION = new Comparator<Aircraft>() {
        @Override
        public int compare(Aircraft a1, Aircraft a2) {
            return a1.getFuelConsumption() - a2.getFuelConsumption();
        }
    };

    public static Comparator<Aircraft> SORT_BY_FLIGHT_RANGE = new Comparator<Aircraft>() {
        @Override
        public int compare(Aircraft a1, Aircraft a2) {
            return a1.getFlightRange() - a2.getFlightRange();
        }
    };

    public static Comparator<Aircraft> SORT_BY_AIRCRAFT_MODEL = new Comparator<Aircraft>() {
        @Override
        public int compare(Aircraft a1, Aircraft a2) {
            return a1.getAircraftModel().compareToIgnoreCase(a2.getAircraftModel());
        }
    };
}
