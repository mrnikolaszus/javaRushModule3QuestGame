package com.example.javarushmodule3questgame;


import com.example.javarushmodule3questgame.text.AllBlocks;
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
        var blocks = new AllBlocks();
        session.setAttribute("alive", Sign.LIFE);
        var data = field.getFieldData();
        var statusSign = Sign.LIFE;
        session.setAttribute("field", field);
        session.setAttribute("data", data);
        session.setAttribute("status", statusSign);
        session.setAttribute("text2", "");
        session.setAttribute("blocks", blocks);
        session.setAttribute("currentBlock", blocks.getField().get(0).getBlock());
        session.setAttribute("buttons", blocks.getField().get(0).getButtons());
        session.setAttribute("text", blocks.getField().get(0).getText());
        session.setAttribute("button1", blocks.getField().get(0).getButton1());
        session.setAttribute("button2", blocks.getField().get(0).getButton2());
        session.setAttribute("button3", blocks.getField().get(0).getButton3());





        log.error("game started " + this.getServletName());
        resp.sendRedirect("/main.jsp");

//        getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);


    }
}
