package com.example.javarushmodule3questgame.servlets;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RestartServletTest {

    @Test
    void doPost() throws IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class, RETURNS_DEEP_STUBS);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        RestartServlet restartServlet = new RestartServlet();
        restartServlet.doPost(request, response);
        verify(request, times(1)).getSession();
        verify(session, times(1)).invalidate();
      verify(response, times(1)).sendRedirect("/start");
    }
}