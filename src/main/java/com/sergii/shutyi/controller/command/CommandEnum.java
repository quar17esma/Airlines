package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.*;

/**
 * Possible Commands.
 */
public enum CommandEnum {
    SHOW_FLEET {
        {
            this.command = new ShowFleetCommand();
        }
    },
    SHOW_AIRLINE_DETAILS {
        {
            this.command = new ShowAirlineDetailsCommand();
        }
    },
    SORT_BY_FUEL_CONSUMPTION {
        {
            this.command = new SortByFuelConsumptionCommand();
        }
    },
    SORT_BY_FLIGHT_RANGE {
        {
            this.command = new SortByFlightRangeCommand();
        }
    },
    FIND_BY_FUEL_CONSUMPTION {
        {
            this.command = new FindByFuelConsumptionCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
