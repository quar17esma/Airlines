package com.sergii.shutyi.controller.command.commands.sort;

import com.sergii.shutyi.model.entity.aircraft.Aircraft;
import com.sergii.shutyi.model.util.sorter.IAircraftSorter;

import java.util.List;

public class SortByFlightRangeCommand extends AbstractSort {

    @Override
    void sort(List<Aircraft> aircraftList, IAircraftSorter sorter) {
        sorter.sortByFlightRange(aircraftList);
    }
}
