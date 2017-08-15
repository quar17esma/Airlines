package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.Airline;

import javax.servlet.http.HttpServletRequest;

/**
 * Command to show all Planes of the Airline.
 */
public class ShowAllCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        Airline airline = Controller.getModel().getAirline();
        request.setAttribute("airline", airline);

        page = ConfigurationManager.getProperty("path.page.show.airline");
        return page;
    }
}
