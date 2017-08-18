package com.sergii.shutyi.model.entity.airline.factory;

import com.sergii.shutyi.dao.airline.AirlineDAO;
import com.sergii.shutyi.dao.airline.IAirlineDAO;
import com.sergii.shutyi.dao.plane.IPlaneDao;
import com.sergii.shutyi.dao.plane.PlaneDAO;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.entity.airline.Airline;
import com.sergii.shutyi.model.util.aggregator.AircraftAggregator;
import com.sergii.shutyi.model.util.aggregator.IAircraftAggregator;

import java.util.List;

public class AirlineFactory extends AbstractAirlineFactory {

    public Airline createAirline() {
        Airline airline;

        IAirlineDAO airlineDAO = new AirlineDAO();
        airline = airlineDAO.getFirstAirline();

        IPlaneDao planeDAO = new PlaneDAO();
        List<Aircraft> aircraftList = planeDAO.getAllPlanes();
        airline.setAircraftList(aircraftList);

        IAircraftAggregator aircraftAggregator = new AircraftAggregator();
        int passengerCapacity = aircraftAggregator.aggregatePassengerCapacity(aircraftList);
        airline.setPassengerCapacity(passengerCapacity);
        int carryingCapacity = aircraftAggregator.aggregateCarryingCapacity(aircraftList);
        airline.setCarryingCapacity(carryingCapacity);

        return airline;
    }
}
