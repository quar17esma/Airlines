package com.sergii.shutyi.controller.command.commands.sort;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.util.sorter.AircraftSorter;
import com.sergii.shutyi.model.util.sorter.IAircraftSorter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public abstract class AbstractSort implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        List<Aircraft> aircraftList = getSortedAircraftList();
        request.setAttribute("planes", aircraftList);

        page = ConfigurationManager.getProperty("path.page.show.airline.fleet");

        return page;
    }

    private List<Aircraft> getSortedAircraftList(){
            List<Aircraft> aircraftList = Controller.getModel().getAirline().getAircraftList();
            IAircraftSorter sorter = new AircraftSorter();
            sort(aircraftList, sorter);

            return aircraftList;
    }

    abstract void sort(List<Aircraft> aircraftList, IAircraftSorter sorter);
}
