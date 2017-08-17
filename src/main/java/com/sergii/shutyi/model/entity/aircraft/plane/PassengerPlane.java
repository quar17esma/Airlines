package com.sergii.shutyi.model.entity.aircraft.plane;

public class PassengerPlane extends AbstractPlane {
    private static final int CARRYING_CAPACITY = 0;

    /**
     * Volume of passenger compartment in cubic meters
     */
    private int passengerCompartmentVolume;

    @Override
    public int getCarryingCapacity() {
        return CARRYING_CAPACITY;
    }

    @Override
    public void setCarryingCapacity(int carryingCapacity) {
        throw new UnsupportedOperationException();
    }

    public int getPassengerCompartmentVolume() {
        return passengerCompartmentVolume;
    }

    public void setPassengerCompartmentVolume(int passengerCompartmentVolume) {
        this.passengerCompartmentVolume = passengerCompartmentVolume;
    }
}
