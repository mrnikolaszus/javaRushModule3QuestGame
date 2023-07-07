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


        if (gameLogic(click, currentBlock, session, blocks)){
        resp.sendRedirect("/main.jsp");}
        else {
            Player field = extractField(session);
            if(field.getField().get(0) == Sign.LIFE && field.getField().get(1) == Sign.DEATH && field.getField().get(2) == Sign.DEATH)
            {
                session.setAttribute("status", Sign.DEATH);
                field.getField().replace(0, Sign.DEATH);
                var data = field.getFieldData();
                session.setAttribute("data", data);
                session.setAttribute("field", field);
                log.error(" from DmgServlet -> main.jsp");
                resp.sendRedirect("/main.jsp");
                return;
            }

            field.getDmg(field);
            log.error(field.getFieldData());
            var data = field.getFieldData();
            session.setAttribute("data", data);
            session.setAttribute("field", field);


            log.error(" from DmgServlet -> main.jsp");
            resp.sendRedirect("/main.jsp");

            }


    }
    private Player extractField(HttpSession session) {
        var field = session.getAttribute("field");
        log.error(field);
        if(field == null){
            log.error("field is null");
            getServletContext().getRequestDispatcher("/start.jsp");
        }
        if(Player.class != field.getClass()){
            log.error("session is broken");
            session.invalidate();
            throw new RuntimeException("Session is broken, try one more time");
        }
        log.error("extractedField DONE OK");
        return (Player) field;
    }

    private boolean gameLogic(String click, Integer currentBlock, HttpSession session, AllBlocks blocks) {

        //block0

        if (currentBlock == 0 && click.equals("1")) {
            session.setAttribute("text", "Вы кричите из-всех сил, но ответа нет. Что же делать дальше?");
            return false;
        }
        if (currentBlock == 0 && click.equals("2")) {
            session.setAttribute("text2", "Вы выбрались через шахту в большой склад.");
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getButtons());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButton1());
            session.setAttribute("button2", blocks.getField().get(1).getButton2());
            session.setAttribute("button3", blocks.getField().get(1).getButton3());
            return true;

        }
        if (currentBlock == 0 && click.equals("3")) {
            session.setAttribute("text2", "Под одним из стелажей вы нашли ключ карту, на ней указано Капитан, неужели это вы?. Использовав ключ карту - дверь открылась");
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getButtons());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButton1());
            session.setAttribute("button2", blocks.getField().get(1).getButton2());
            session.setAttribute("button3", blocks.getField().get(1).getButton3());
            return true;
        }


        //block1

        if (currentBlock == 1 && click.equals("1")) {
            session.setAttribute("text", "Вы кричите из-всех сил, но ответа нет. Что же делать дальше?");
            return false;
        }
        if (currentBlock == 1 && click.equals("2")) {
            session.setAttribute("text2", "Вы выбрались через шахту в коридор.");
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getButtons());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButton1());
            session.setAttribute("button2", blocks.getField().get(1).getButton2());
            session.setAttribute("button3", blocks.getField().get(1).getButton3());
            return false;
        }
        if (currentBlock == 1 && click.equals("3")) {
            session.setAttribute("text2", "Под одним из стелажей вы нашли ключ карту, на ней указано Капитан, неужели это вы?. Использовав ключ карту - дверь открылась");
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getButtons());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButton1());
            session.setAttribute("button2", blocks.getField().get(1).getButton2());
            session.setAttribute("button3", blocks.getField().get(1).getButton3());
            return false;
        }
        return false;
    }
}
