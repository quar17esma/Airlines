package com.sergii.shutyi.model.entity;

public class PassengerPlane extends AbstractPlane {
    private static final int CARRYING_CAPACITY = 0;

    @Override
    public int getCarryingCapacity() {
        return CARRYING_CAPACITY;
    }

    @Override
    public void setCarryingCapacity(int carryingCapacity) {
        throw new UnsupportedOperationException();
    }
}
