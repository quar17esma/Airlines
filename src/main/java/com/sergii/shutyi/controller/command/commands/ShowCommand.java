package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.entity.Notebook;

import javax.servlet.http.HttpServletRequest;

/**
 * Command to show all Notes from Notebook.
 */
public class ShowNotebookCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        Notebook notebook = Controller.getModel().getNotebook();
        request.setAttribute("Notebook", notebook);

        page = ConfigurationManager.getProperty("path.page.show.notebook");
        return page;
    }
}
