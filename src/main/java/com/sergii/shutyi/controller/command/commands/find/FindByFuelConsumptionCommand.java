package com.sergii.shutyi.controller.command.commands.find;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.exceptions.IllegalFuelConsumptionRange;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.controller.manager.LabelManager;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.util.finder.AircraftFinder;
import com.sergii.shutyi.model.util.finder.IAircraftFinder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class FindByFuelConsumptionCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        List<Aircraft> aircraftListInRange = findByFuelConsumption(request);
        request.setAttribute("planes", aircraftListInRange);

        page = ConfigurationManager.getProperty("path.page.show.airline.fleet");

        return page;
    }

    private List<Aircraft> findByFuelConsumption(HttpServletRequest request) {

        int minFuelConsumption = Integer.parseInt(request.getParameter("min_fuel_consumption"));
        int maxFuelConsumption = Integer.parseInt(request.getParameter("max_fuel_consumption"));
        List<Aircraft> aircraftList = Controller.getModel().getAirline().getAircraftList();

        IAircraftFinder finder = new AircraftFinder();
        try {
            aircraftList = finder.findByFuelConsumptionRange(aircraftList, minFuelConsumption, maxFuelConsumption);
        } catch (IllegalFuelConsumptionRange e) {
            String s = LabelManager.getProperty("wrong.fuel.consumption.range");
            request.setAttribute("wrongFuelConsumptionRange", s);
        }
        return aircraftList;
    }
}
