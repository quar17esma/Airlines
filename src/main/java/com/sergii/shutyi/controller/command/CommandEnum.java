package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.ShowNotebookCommand;

/**
 * Possible Commands.
 */
public enum CommandEnum {
    ADD_NOTE{
        {
            this.command = new AddNoteCommand();
        }
    },
    SHOW_NOTEBOOK{
        {
            this.command = new ShowNotebookCommand();
        }
    },
    INPUT_NOTE{
        {
            this.command = new InputNoteCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand(){
        return command;
    }
}
