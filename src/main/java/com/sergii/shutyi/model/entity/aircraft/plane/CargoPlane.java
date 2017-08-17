package com.sergii.shutyi.model.entity.aircraft.plane;

public class CargoPlane extends AbstractPlane {
    private static final int PASSENGER_CAPACITY = 0;

    /**
     * Volume of cargo compartment in unified containers
     */
    private int CargoCompartmentVolume;

    @Override
    public int getPassengerCapacity() {
        return PASSENGER_CAPACITY;
    }

    @Override
    public void setPassengerCapacity(int passengerCapacity) {
        throw new UnsupportedOperationException();
    }

    public int getCargoCompartmentVolume() {
        return CargoCompartmentVolume;
    }

    public void setCargoCompartmentVolume(int cargoCompartmentVolume) {
        CargoCompartmentVolume = cargoCompartmentVolume;
    }
}
