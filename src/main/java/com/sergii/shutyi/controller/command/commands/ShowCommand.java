package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.command.ActionCommand;
import javax.servlet.http.HttpServletRequest;

/**
 * Command to show all Planes of the Airline.
 */
public class ShowCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
//
//        Notebook notebook = Controller.getModel().getNotebook();
//        request.setAttribute("Notebook", notebook);
//
//        page = ConfigurationManager.getProperty("path.page.show.notebook");
        return page;
    }
}
