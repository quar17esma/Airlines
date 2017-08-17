package com.sergii.shutyi.model;

import com.sergii.shutyi.model.entity.Airline;

public class Model {
    private Airline airline = new Airline();

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
