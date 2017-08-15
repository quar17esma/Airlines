package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.ShowAllCommand;

/**
 * Possible Commands.
 */
public enum CommandEnum {
    SHOW_AIRLINE {
        {
            this.command = new ShowAllCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
