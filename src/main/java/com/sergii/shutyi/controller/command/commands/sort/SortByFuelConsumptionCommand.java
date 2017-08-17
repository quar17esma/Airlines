package com.sergii.shutyi.controller.command.commands.sort;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.util.sorter.AircraftSorter;
import com.sergii.shutyi.model.util.sorter.IAircraftSorter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SortByFuelConsumptionCommand extends AbstractSort {

    @Override
    void sort(List<Aircraft> aircraftList, IAircraftSorter sorter) {
        sorter.sortByFuelConsumption(aircraftList);
    }
}
