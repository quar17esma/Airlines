package com.sergii.shutyi.dao;

import com.sergii.shutyi.model.entity.plane.AbstractPlane;
import org.junit.Test;

import java.util.List;

public class PlaneDAOTest {
    @Test
    public void findAll() throws Exception {
        PlaneDAO planeDAO = new PlaneDAO();
        List<AbstractPlane> planes = planeDAO.findAll();
        System.out.println(planes);
    }

}