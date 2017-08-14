package com.sergii.shutyi.model.entity;

public class CargoPlane extends AbstractPlane {
    public static final int PASSENGER_CAPACITY = 0;

    @Override
    public int getPassengerCapacity() {
        return PASSENGER_CAPACITY;
    }
}
