package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.command.commands.EmptyCommand;
import com.sergii.shutyi.controller.manager.MessageManager;
import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    /**
     * Method defines concrete command to execute from request parameter.
     * @param request HttpServletRequest to get command parameter
     * @return Command
     */
    public ActionCommand defineCommand(HttpServletRequest request){
        ActionCommand currentCommand = new EmptyCommand();

        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return currentCommand;
        }
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            currentCommand = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrong action", action + MessageManager.getProperty("message.wrong.action"));
        }
        return currentCommand;
    }
}
