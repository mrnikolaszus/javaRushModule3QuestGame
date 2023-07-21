package com.example.javarushmodule3questgame.servlets;

import com.example.javarushmodule3questgame.javaLogic.Sign;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class InitServletTest {

    @Test
    void doGet() throws IOException, ServletException {

        HttpServletRequest request = Mockito.mock(HttpServletRequest.class, RETURNS_DEEP_STUBS);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        InitServlet initServlet = new InitServlet();
        initServlet.doGet(request, response);
        verify(request, times(1)).getSession(true);
        verify(response, times(1)).sendRedirect("/main.jsp");

    }
}