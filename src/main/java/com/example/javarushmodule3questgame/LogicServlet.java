package com.example.javarushmodule3questgame;

import com.example.javarushmodule3questgame.text.AllBlocks;
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
import java.util.Objects;

@WebServlet (name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {

    private static final Logger log = LogManager.getLogger(LogicServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var session = req.getSession();
        var click = req.getParameter("click");
        var currentBlock = (Integer) session.getAttribute("currentBlock");
        var blocks = (AllBlocks) session.getAttribute("blocks");
        gameLogic(click, currentBlock, session, blocks);
        resp.sendRedirect("/main.jsp");

    }

    private void gameLogic(String click, Integer currentBlock, HttpSession session, AllBlocks blocks) {
        if(currentBlock == 0 && click.equals("1")){
            session.setAttribute("text", "Вы кричите из-всех сил, но ответа нет. Что же делать дальше?");
        }
        if(currentBlock == 0 && click.equals("2")){
            session.setAttribute("text2", "Вы выбрались через шахту в коридор.");
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getButtons());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButton1());
            session.setAttribute("button2", blocks.getField().get(1).getButton2());
            session.setAttribute("button3", blocks.getField().get(1).getButton3());
        }
        if(currentBlock == 0 && click.equals("3")){
            session.setAttribute("text2", "Под одним из стелажей вы нашли ключ карту, на ней указано Капитан, неужели это вы?. Использовав ключ карту - дверь открылась");
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getButtons());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButton1());
            session.setAttribute("button2", blocks.getField().get(1).getButton2());
            session.setAttribute("button3", blocks.getField().get(1).getButton3());
        }
    }


}
