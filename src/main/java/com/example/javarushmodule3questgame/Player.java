package com.example.javarushmodule3questgame;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Player {

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