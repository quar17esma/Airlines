package com.sergii.shutyi.dao;

import com.sergii.shutyi.model.entity.plane.AbstractPlane;
import com.sergii.shutyi.model.entity.plane.CargoPlane;
import com.sergii.shutyi.model.entity.plane.PassengerPlane;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

public class PlaneDAO {
    ResourceBundle resource = ResourceBundle.getBundle("database");
    String url = resource.getString("db.url");
    String user = resource.getString("db.user");
    String password = resource.getString("db.password");

    public static final String SQL_SELECT_ALL_PLANES = "SELECT * FROM planes";

    public List<AbstractPlane> findAll() {
        List<AbstractPlane> planes = new ArrayList<>();

        ResourceBundle resource = ResourceBundle.getBundle("database");
        Properties properties = new Properties();
        properties.put("user", resource.getString("db.user"));
        properties.put("password", resource.getString("db.password"));
        properties.put("autoReconnect", resource.getString("db.autoReconnect"));
        properties.put("characterEncoding", resource.getString("db.characterEncoding"));
        properties.put("useUnicode", resource.getString("db.useUnicode"));
        properties.put("useJDBCCompliantTimezoneShift", resource.getString("db.useJDBCCompliantTimezoneShift"));
        properties.put("useLegacyDatetimeCode", resource.getString("db.useLegacyDatetimeCode"));
        properties.put("serverTimezone", resource.getString("db.serverTimezone"));

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(url, properties);
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
