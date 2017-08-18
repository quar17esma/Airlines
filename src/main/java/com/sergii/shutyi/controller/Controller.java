package com.sergii.shutyi.controller;

import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.command.ActionFactory;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "controller", urlPatterns = "/controller", loadOnStartup = 1)
public class Controller extends HttpServlet {

    private static Model model = new Model();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;

        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(request);

        page = command.execute(request);

        Objects.requireNonNull(page);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);

    }

    public static Model getModel() {
        return model;
    }

    public static void setModel(Model model) {
        Controller.model = model;
    }
}
