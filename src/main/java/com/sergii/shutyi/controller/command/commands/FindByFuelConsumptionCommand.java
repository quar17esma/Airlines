package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.util.finder.AircraftFinder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class FindByFuelConsumptionCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        int minFuelConsumption = Integer.parseInt(request.getParameter("min_fuel_consumption"));
        int maxFuelConsumption = Integer.parseInt(request.getParameter("max_fuel_consumption"));
        List<Aircraft> planes = Controller.getModel().getAirline().getAircraftList();

        AircraftFinder finder = new AircraftFinder();
        planes = finder.findByFuelConsumptionRange(planes, minFuelConsumption, maxFuelConsumption);
        request.setAttribute("planes", planes);

        page = ConfigurationManager.getProperty("path.page.show.airline.fleet");

        return page;
    }
}
