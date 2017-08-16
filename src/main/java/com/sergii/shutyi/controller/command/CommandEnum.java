package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.ShowAllCommand;
import com.sergii.shutyi.controller.command.commands.ShowFindByFuelConsumption;
import com.sergii.shutyi.controller.command.commands.ShowSortedByFlightRange;
import com.sergii.shutyi.controller.command.commands.ShowSortedByFuelConsumption;

/**
 * Possible Commands.
 */
public enum CommandEnum {
    SHOW_AIRLINE {
        {
            this.command = new ShowAllCommand();
        }
    },
    SHOW_SORTED_BY_FUEL_CONSUMPTION {
        {
            this.command = new ShowSortedByFuelConsumption();
        }
    },
    SHOW_SORTED_BY_FLIGHT_RANGE {
        {
            this.command = new ShowSortedByFlightRange();
        }
    },
    SHOW_FIND_BY_FUEL_CONSUMPTION {
        {
            this.command = new ShowFindByFuelConsumption();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
