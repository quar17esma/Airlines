package com.sergii.shutyi.model.entity;

public class AbstractPlane implements Aircraft {
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
}
