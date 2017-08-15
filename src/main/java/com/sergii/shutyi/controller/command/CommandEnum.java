package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.ShowAllCommand;

/**
 * Possible Commands.
 */
public enum CommandEnum {
    SHOW_NOTEBOOK{
        {
            this.command = new ShowAllCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand(){
        return command;
    }
}
