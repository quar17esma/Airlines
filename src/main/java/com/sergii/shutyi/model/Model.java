package com.sergii.shutyi.model;

import com.sergii.shutyi.model.entity.airline.Airline;
import com.sergii.shutyi.model.entity.airline.factory.AirlineFactory;

public class Model {
    private Airline airline;

    public Model() {
        AirlineFactory airlineFactory = new AirlineFactory();
        this.airline = airlineFactory.createAirline();
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
