package com.sergii.shutyi.dao;

import com.sergii.shutyi.model.entity.plane.AbstractPlane;
import com.sergii.shutyi.model.entity.plane.CargoPlane;
import com.sergii.shutyi.model.entity.plane.PassengerPlane;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaneDAO {

    public static final String SQL_SELECT_ALL_PLANES = "SELECT * FROM planes";

    public List<AbstractPlane> findAll() {
        List<AbstractPlane> planes = new ArrayList<>();

        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_PLANES);
            while (resultSet.next()) {
                AbstractPlane plane;
                String type = resultSet.getString("type");
                if (type.equalsIgnoreCase("cargo")){
                    plane = new CargoPlane();
                    plane.setCarryingCapacity(resultSet.getInt("carrying_capacity"));
                } else if (type.equalsIgnoreCase("passenger")){
                    plane = new PassengerPlane();
                    plane.setPassengerCapacity(resultSet.getInt("passenger_capacity"));
                } else {
                    throw new SQLException("Unsupported plane type");
                }
                plane.setId(resultSet.getInt("id"));
                plane.setAircraftModel(resultSet.getString("model"));
                plane.setFlightRange(resultSet.getInt("flight_range"));
                plane.setFuelConsumption(resultSet.getInt("fuel_consumption"));
                planes.add(plane);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planes;
    }
}
