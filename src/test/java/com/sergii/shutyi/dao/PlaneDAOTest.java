package com.sergii.shutyi.dao;

import com.sergii.shutyi.model.entity.AbstractPlane;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlaneDAOTest {
    @Test
    public void findAll() throws Exception {
        PlaneDAO planeDAO = new PlaneDAO();
        List<AbstractPlane> planes = planeDAO.findAll();
        System.out.println(planes);
    }

}