package com.sergii.shutyi.model.entity.plane;

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
            plane = new CargoPlane();
            plane.setCarryingCapacity(resultSet.getInt("carrying_capacity"));
        } else if (type.equalsIgnoreCase("passenger")) {
            plane = new PassengerPlane();
            plane.setPassengerCapacity(resultSet.getInt("passenger_capacity"));
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