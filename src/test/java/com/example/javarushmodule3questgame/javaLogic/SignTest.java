package com.example.javarushmodule3questgame.javaLogic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.Inet4Address;
import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SignTest {
    static HashMap<Integer, Sign> field = new HashMap<>();
    @BeforeAll
    static void init(){
        field.put(0, Sign.LIFE);
        field.put(1, Sign.DEATH);
        field.put(2, Sign.RESTART);

    }

    @Test
    public void getSignOfLifeSignShouldReturnHeartCharTest()
    {
        assertEquals('♥', field.get(0).getSign());
    }
    @Test
    public void getSignOfDeathSignShouldReturnCrossCharTest()
    {
        assertEquals('✘', field.get(1).getSign());
    }
    @Test
    public void getSignOfRestartSignShouldReturnRCharTest()
    {
        assertEquals('R', field.get(2).getSign());
    }


}