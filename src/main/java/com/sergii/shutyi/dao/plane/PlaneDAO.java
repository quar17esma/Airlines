package com.sergii.shutyi.dao.plane;

import com.sergii.shutyi.dao.ConnectorDB;
import com.sergii.shutyi.model.entity.aircraft.plane.PlaneFactory;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaneDAO {

    private static final String SQL_SELECT_ALL_PLANES = "SELECT * FROM planes";

    public List<Aircraft> findAll() {
        List<Aircraft> planes = new ArrayList<>();

        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_PLANES);
            PlaneFactory planeFactory = new PlaneFactory();

            while (resultSet.next()) {
                Aircraft plane = planeFactory.createPlane(resultSet);
                planes.add(plane);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planes;
    }
}
