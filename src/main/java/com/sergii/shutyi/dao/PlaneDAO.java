package com.sergii.shutyi.dao;

import com.sergii.shutyi.model.PlaneFactory;
import com.sergii.shutyi.model.entity.Aircraft;
import com.sergii.shutyi.model.entity.plane.AbstractPlane;
import com.sergii.shutyi.model.entity.plane.CargoPlane;
import com.sergii.shutyi.model.entity.plane.PassengerPlane;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaneDAO {

    public static final String SQL_SELECT_ALL_PLANES = "SELECT * FROM planes";

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
