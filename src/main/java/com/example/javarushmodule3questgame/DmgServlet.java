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


@WebServlet(name = "GotDamage", value = "/dmg")
public class DmgServlet extends HttpServlet {

    private static final Logger log = LogManager.getLogger(DmgServlet.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var session = req.getSession();
        Player field = extractField(session);
        field.getDmg(field);
        log.error(field.getFieldData());
        var data = field.getFieldData();
        session.setAttribute("data", data);
        session.setAttribute("field", field);

        log.error(" from DmgServlet -> main.jsp");
        resp.sendRedirect("/main.jsp");
    }
    private Player extractField(HttpSession session) {
        var field = session.getAttribute("field");
        log.error(field);
//        if(field == null){
//            log.error("field is null");
//            getServletContext().getRequestDispatcher("/start.jsp");
//        }
//        if(Player.class != field.getClass()){
//            log.error("session is broken");
//            session.invalidate();
//            throw new RuntimeException("Session is broken, try one more time");
//        }
        log.error("extractedField DONE OK");
        return (Player) field;
    }
}
