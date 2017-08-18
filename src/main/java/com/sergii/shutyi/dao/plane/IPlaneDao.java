package com.sergii.shutyi.dao.plane;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;

import java.util.List;

public interface IPlaneDao {
    List<Aircraft> getAllPlanes();
}
