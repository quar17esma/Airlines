package com.sergii.shutyi.dao.airline;

import com.sergii.shutyi.dao.ConnectorDB;
import com.sergii.shutyi.model.entity.airline.Airline;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class AirlineDAO {
    public static final String SQL_SELECT_ALL_AIRLINES = "SELECT * FROM airline";

    public void setAirlineParameters(Airline airline) {

        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_AIRLINES);
            if (resultSet.next()) {
                airline.setName(resultSet.getString("name"));
                airline.setHeadquarters(resultSet.getString("headquarters"));
                airline.setHubs(resultSet.getString("hubs"));
                airline.setParentCompany(resultSet.getString("parent_company"));
                airline.setFounded(LocalDate.parse((resultSet.getString("founded"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
