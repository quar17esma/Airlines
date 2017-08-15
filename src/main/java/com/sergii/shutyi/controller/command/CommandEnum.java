package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.ShowAllCommand;
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
    SHOW_SORTED_BY_FUEL_CONSUMPTION{
        {
            this.command = new ShowSortedByFuelConsumption();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
