package com.sergii.shutyi.model.entity.aircraft.plane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class PlaneFactory {
    public AbstractPlane createPlane(ResultSet resultSet) throws SQLException {
        AbstractPlane plane = null;

        String type = Objects.requireNonNull(resultSet.getString("type"));
        if (type.isEmpty()) {
            throw new SQLException("Type of plane can not be empty String");
        }

        if (type.equalsIgnoreCase("cargo")) {
            CargoPlane cargoPlane = new CargoPlane();
            cargoPlane.setCarryingCapacity(resultSet.getInt("carrying_capacity"));
            cargoPlane.setCargoCompartmentVolume(resultSet.getInt("cargo_compartment_volume"));
            plane = cargoPlane;
        } else if (type.equalsIgnoreCase("passenger")) {
            PassengerPlane passengerPlane = new PassengerPlane();
            passengerPlane.setPassengerCapacity(resultSet.getInt("passenger_capacity"));
            passengerPlane.setPassengerCompartmentVolume(resultSet.getInt("passenger_compartment_volume"));
            plane = passengerPlane;
        } else {
            throw new SQLException("Unsupported plane type");
        }

        plane.setId(resultSet.getInt("id"));
        plane.setAircraftModel(resultSet.getString("model"));
        plane.setFlightRange(resultSet.getInt("flight_range"));
        plane.setFuelConsumption(resultSet.getInt("fuel_consumption"));

        return plane;
    }
}
