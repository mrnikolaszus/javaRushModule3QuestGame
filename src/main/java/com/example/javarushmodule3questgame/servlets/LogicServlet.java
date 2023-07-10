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
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.example.javarushmodule3questgame.textLogic.TextLogicGame.gameLogic;

@WebServlet (name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {

    private static final Logger log = LogManager.getLogger(LogicServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var session = req.getSession();
        var click = req.getParameter("click");
        var currentBlock = (Integer) session.getAttribute("currentBlock");
        var blocks = (AllBlocks) session.getAttribute("blocks");


        if (!gameLogic(click, currentBlock, session, blocks)){
        resp.sendRedirect("/main.jsp");}
        else {  // dmg block: if buttonDmg true - minus one life
            Player field = extractField(session);
            if((field.getField().get(0) == Sign.LIFE && field.getField().get(1) == Sign.DEATH && field.getField().get(2) == Sign.DEATH) )
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
        // END of dmg block: if buttonDmg true - minus one life

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


}
