package com.example.javarushmodule3questgame.javaLogic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    static HashMap<Integer, Sign> field = new HashMap<>();
    static Player player;
    @BeforeAll
    static void init(){
        player = new Player();
        field.put(0, Sign.LIFE);
        field.put(1, Sign.DEATH);
        field.put(2, Sign.RESTART);
    }

    @Test
    void newPlayerShouldCreateNewHashmapFullOfLifeTest() {
        HashMap<Integer, Sign> fieldAllLife = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            fieldAllLife.put(i, Sign.LIFE);
        }
        assertEquals(player.getField(), fieldAllLife);
    }

    @Test
    void getFieldShouldReturnHashMapTest () {
        assertEquals( player.getField().getClass() , HashMap.class);
    }

    @Test
    void getFieldKeyShouldReturnSignTest () {
        assertEquals( player.getField().get(0).getClass() , Sign.class);
    }

    @Test
    void getDmgComplexTestSorryTest() {
        var player1 = new Player();
        var player2 = new Player();
        var player3 = new Player();
        var player4 = new Player();

        for (int i = 0; i < 3; i++) {
            if(i<1) {
                player1.getField().put(i, Sign.LIFE);
            }
            player1.getField().put(i, Sign.DEATH);
        }
        for (int i = 0; i < 3; i++) {
            if(i<2) {
                player2.getField().put(i, Sign.LIFE);
            }
            player2.getField().put(i, Sign.DEATH);
        }

        for (int i = 0; i < 3; i++) {
            player3.getField().put(i, Sign.LIFE);

        }for (int i = 0; i < 3; i++) {
            player4.getField().put(i, Sign.DEATH);
        }

        assertFalse(player1.getDmg(player1));
        assertFalse(player2.getDmg(player2));
        assertTrue(player3.getDmg(player3));
        assertFalse(player4.getDmg(player4));

    }

    @Test
    void getDateShouldReturnCurrentData() {
        Date date1 = new Date();
        assertEquals(player.getDate().getDate(), date1.getDate());
    }

    @Test
    void getFieldDataShouldReturnListOfSignsTest() {
       List<Sign> list = new ArrayList<>();
        assertEquals(player.getFieldData().getClass(), list.getClass());
        assertEquals( player.getFieldData().get(0).getClass() , Sign.class);
    }
}