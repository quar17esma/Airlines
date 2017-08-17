package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.Aircraft;
import com.sergii.shutyi.model.util.AircraftSorter;
import com.sergii.shutyi.model.util.AirlineUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SortByFuelConsumptionCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        List<Aircraft> planes = Controller.getModel().getAirline().getAircraftList();
        AircraftSorter sorter = new AircraftSorter();
        sorter.sortByFuelConsumption(planes);
        request.setAttribute("planes", planes);

        page = ConfigurationManager.getProperty("path.page.show.airline.fleet");

        return page;
    }
}
