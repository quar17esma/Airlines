package com.sergii.shutyi.model.entity.aircraft.plane.factory;

import com.sergii.shutyi.model.entity.aircraft.plane.AbstractPlane;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractPlaneFactory {
    abstract AbstractPlane createPlane(ResultSet resultSet) throws SQLException;
}
