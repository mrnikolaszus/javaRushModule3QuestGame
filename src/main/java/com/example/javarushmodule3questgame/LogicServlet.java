package com.example.javarushmodule3questgame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var session = req.getSession();
        Player field = extractField(session);
        var index = getSelectedIndex(req);
        var sign = field.getField().get(index);

        }

    private Player extractField(HttpSession session) {
        var field = session.getAttribute("field");
        if(field == null){
            getServletContext().getRequestDispatcher("/start.jsp");
        }
        if(Player.class != field.getClass()){
            session.invalidate();
            throw new RuntimeException("Session is broken, try one more time");
        }
        return (Player) field;
    }

    private int getSelectedIndex(HttpServletRequest req) {
        var click = req.getParameter("click");
        var isNumeric = click.chars().allMatch(Character::isDigit);
        return isNumeric ? Integer.parseInt(click) : 0;
    }

    private boolean checkDeath(HttpServletResponse res, HttpSession session, Player field) throws IOException {
        var death = field.checkDeath();
        if(Sign.DEATH == death ){

            session.setAttribute("alive", death);

            var data = field.getFieldData();

            session.setAttribute("data", data);

            res.sendRedirect("/index.jsp");

            return true;

        }
        return false;
    }
}
