package com.sergii.shutyi.model.entity.plane;

import com.sergii.shutyi.model.entity.Aircraft;

import java.util.Objects;

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
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }

    public void setAircraftModel(String aircraftModel) {
        if (!Objects.requireNonNull(aircraftModel).isEmpty()) {
            this.aircraftModel = aircraftModel;
        } else {
            throw new IllegalArgumentException("aircraft model can't be empty string");
        }
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity >= 0) {
            this.passengerCapacity = passengerCapacity;
        } else {
            throw new IllegalArgumentException("passengerCapacity can't be negative");
        }
    }

    public void setCarryingCapacity(int carryingCapacity) {
        if (carryingCapacity >= 0) {
            this.carryingCapacity = carryingCapacity;
        } else {
            throw new IllegalArgumentException("carryingCapacity can't be negative");
        }
    }

    public void setFlightRange(int flightRange) {
        if (flightRange >= 0) {
            this.flightRange = flightRange;
        } else {
            throw new IllegalArgumentException("flightRange can't be negative");
        }
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption >= 0) {
            this.fuelConsumption = fuelConsumption;
        } else {
            throw new IllegalArgumentException("fuelConsumption can't be negative");
        }
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
