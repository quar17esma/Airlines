package com.sergii.shutyi.model.entity.plane;

public class CargoPlane extends AbstractPlane {
    private static final int PASSENGER_CAPACITY = 0;

    @Override
    public int getPassengerCapacity() {
        return PASSENGER_CAPACITY;
    }

    @Override
    public void setPassengerCapacity(int passengerCapacity) {
        throw new UnsupportedOperationException();
    }

}
