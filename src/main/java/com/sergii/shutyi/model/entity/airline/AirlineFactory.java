package com.sergii.shutyi.model.entity.airline;

import com.sergii.shutyi.dao.airline.AirlineDAO;
import com.sergii.shutyi.dao.plane.PlaneDAO;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.util.aggregator.AircraftAggregator;
import com.sergii.shutyi.model.util.aggregator.IAircraftAggregator;

import java.util.List;

public class AirlineFactory {

    public static Airline createAirline() {
        Airline airline = new Airline();

        PlaneDAO planeDAO = new PlaneDAO();
        List<Aircraft> aircraftList = planeDAO.findAll();
        airline.setAircraftList(aircraftList);

        IAircraftAggregator aircraftAggregator = new AircraftAggregator();
        int passengerCapacity = aircraftAggregator.aggregatePassengerCapacity(aircraftList);
        airline.setPassengerCapacity(passengerCapacity);
        int carryingCapacity = aircraftAggregator.aggregateCarryingCapacity(aircraftList);
        airline.setCarryingCapacity(carryingCapacity);

        AirlineDAO airlineDAO = new AirlineDAO();
        airlineDAO.setAirlineParameters(airline);

        return airline;
    }
}
