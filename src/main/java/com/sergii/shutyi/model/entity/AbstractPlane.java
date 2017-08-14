package com.sergii.shutyi.model.entity;

public abstract class AbstractPlane implements Aircraft {
    /**
     * ID of the plane
     */
    private int id;

    /**
     * Model of the plane
     */
    private String aircraftModel;

    /**
     * Passengers capacity of the plane
     */
    private int passengerCapacity;

    /**
     * Carrying capacity of the plane in kg.
     */
    private int carryingCapacity;

    /**
     * Flight range of the plane. How far it can flight in km.
     */
    private int flightRange;

    /**
     * Fuel consumption of the plane. Litres on 100 kilometers
     */
    private int fuelConsumption;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getAircraftModel() {
        return aircraftModel;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public int getFlightRange() {
        return flightRange;
    }

    @Override
    public int getFuelsConsumption() {
        return fuelConsumption;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "AbstractPlane{" +
                "id=" + id +
                ", aircraftModel='" + aircraftModel + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", carryingCapacity=" + carryingCapacity +
                ", flightRange=" + flightRange +
                ", fuelConsumption=" + fuelConsumption +
                '}' + "\n";
    }
}
