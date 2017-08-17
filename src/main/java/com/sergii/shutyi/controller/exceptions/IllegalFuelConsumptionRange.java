package com.sergii.shutyi.controller.exceptions;

/**
 * Thrown when trying to input illegal fuel consumption range
 */
public class IllegalFuelConsumptionRange extends Exception {

    /**
     * Constructs an {@code IllegalFuelConsumptionRange} with the specified detail message.
     * @param message
     */
    public IllegalFuelConsumptionRange(String message) {
        super(message);
    }

}
