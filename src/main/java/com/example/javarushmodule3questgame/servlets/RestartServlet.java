package com.example.javarushmodule3questgame.servlets;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "RestartServlet", value = "/restart")
public class RestartServlet extends HttpServlet {

    private static final Logger log = LogManager.getLogger(RestartServlet.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.getSession().invalidate();
        log.error("restarted game - > /start");
        resp.sendRedirect("/start");
    }
}