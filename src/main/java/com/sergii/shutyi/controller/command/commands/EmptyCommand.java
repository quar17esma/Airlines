package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.Aircraft;
import com.sergii.shutyi.model.entity.Airline;
import com.sergii.shutyi.model.entity.plane.AbstractPlane;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        page = ConfigurationManager.getProperty("path.page.index");

        return  page;
    }
}
