package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.ShowCommand;

/**
 * Possible Commands.
 */
public enum CommandEnum {
    SHOW_NOTEBOOK{
        {
            this.command = new ShowCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand(){
        return command;
    }
}
