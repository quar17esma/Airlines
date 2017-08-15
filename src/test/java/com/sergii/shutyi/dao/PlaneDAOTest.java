package com.sergii.shutyi.dao;

import com.sergii.shutyi.model.entity.Aircraft;
import com.sergii.shutyi.model.entity.plane.AbstractPlane;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class PlaneDAOTest {
    @Ignore
    @Test
    public void findAll() throws Exception {
        PlaneDAO planeDAO = new PlaneDAO();
        List<Aircraft> planes = planeDAO.findAll();
        System.out.println(planes);
    }

}