package com.sergii.shutyi.model.util;

import com.sergii.shutyi.model.entity.Aircraft;

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
}
