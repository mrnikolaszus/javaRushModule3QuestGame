package com.example.javarushmodule3questgame;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Player {
    private static final Logger log = LogManager.getLogger(Player.class);
    private final Map<Integer, Sign> field;

    public Player() {
        field = new HashMap<>();
        field.put(0, Sign.LIFE);
        field.put(1, Sign.LIFE);
        field.put(2, Sign.LIFE);
    }

    public Map<Integer, Sign> getField() {
        return field;
    }

    public boolean getDmg(Player p){


        if(p.field.get(2) == Sign.LIFE){
            p.field.replace(2, Sign.DEATH);
            return true;
        }
        else if(p.field.get(1) == Sign.LIFE){
            p.field.replace(1, Sign.DEATH);

            return true;
        }
        else if(p.field.get(0) == Sign.LIFE){
            p.field.replace(0, Sign.DEATH);

            return true;
        }

        else {

            return false;
        }
    }


    public List<Sign> getFieldData() {
        return field.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
    public Sign checkDeath() {
        List<List<Integer>> winPossibilities = List.of(
                List.of(0, 1, 2)
        );

        for (List<Integer> winPossibility : winPossibilities) {
            if (field.get(winPossibility.get(0)) == field.get(winPossibility.get(1))
                    && field.get(winPossibility.get(0)) == field.get(winPossibility.get(2))) {
                return field.get(winPossibility.get(0));
            }
        }
        return Sign.DEATH;
    }


}