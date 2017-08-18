package com.sergii.shutyi.dao;

import com.sergii.shutyi.dao.plane.IPlaneDao;
import com.sergii.shutyi.dao.plane.PlaneDAO;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class PlaneDAOTest {
    @Ignore
    @Test
    public void findAll() throws Exception {
        IPlaneDao planeDAO = new PlaneDAO();
        List<Aircraft> planes = planeDAO.getAllPlanes();
        System.out.println(planes);
    }

}