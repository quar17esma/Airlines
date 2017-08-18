package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.EmptyCommand;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    /**
     * Method defines concrete command to execute from request parameter.
     *
     * @param request HttpServletRequest to get command parameter
     * @return Command
     */
    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand currentCommand = new EmptyCommand();

        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return currentCommand;
        }

        CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
        currentCommand = currentEnum.getCurrentCommand();

        return currentCommand;
    }
}
