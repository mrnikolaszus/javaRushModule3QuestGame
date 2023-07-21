package com.example.javarushmodule3questgame.servlets;


import com.example.javarushmodule3questgame.javaLogic.Player;
import com.example.javarushmodule3questgame.javaLogic.Sign;
import com.example.javarushmodule3questgame.textLogic.AllBlocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;


@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    private static final Logger log = LogManager.getLogger(InitServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.error(req.toString() + " test " + resp.toString());
        var session = req.getSession(true);
        var field = new Player();
        var blocks = new AllBlocks();
        session.setAttribute("alive", Sign.LIFE);
        var data = field.getFieldData();
        var sessionID = session.getId();
        var statusSign = Sign.LIFE;

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy : z");
        var date  = field.getDate();
        session.setAttribute("date", formatter.format(date));
        session.setAttribute("sessionID", sessionID);
        session.setAttribute("endRestart", Sign.LIFE);
        session.setAttribute("field", field);
        session.setAttribute("data", data);
        session.setAttribute("status", statusSign);
        session.setAttribute("text2", "В недалеком будущем, где-то в глубинах космоса, на исследовательском космическом корабле...");
        session.setAttribute("blocks", blocks);
        session.setAttribute("currentBlock", blocks.getField().get(0).getBlock());
        session.setAttribute("buttons", blocks.getField().get(0).getActiveButtonsQnt());
        session.setAttribute("text", blocks.getField().get(0).getText());
        session.setAttribute("button1", blocks.getField().get(0).getButtonOne().getButton());
        session.setAttribute("button2", blocks.getField().get(0).getButtonTwo().getButton());
        session.setAttribute("button3", blocks.getField().get(0).getButtonThree().getButton());





        log.error("game started");
        resp.sendRedirect("/main.jsp");

//        getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);


    }
}
