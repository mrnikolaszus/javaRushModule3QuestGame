package com.example.javarushmodule3questgame;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    private static final Logger log = LogManager.getLogger(InitServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var session = req.getSession(true);
        var field = new Player();
        session.setAttribute("alive", Sign.LIFE);
        var data = field.getFieldData();
        var statusSign = Sign.LIFE;
        session.setAttribute("field", field);
        session.setAttribute("data", data);
        session.setAttribute("status", statusSign);
        log.error("game started " + this.getServletName());
        log.error("game started " + this.getServletName());
        log.error("game started " + this.getServletName());

        getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);


    }
}
