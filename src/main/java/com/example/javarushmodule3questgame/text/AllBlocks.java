package com.example.javarushmodule3questgame.text;

import java.util.HashMap;
import java.util.Map;

public class AllBlocks {
    private final Map<Integer, Block> blocks;

    public AllBlocks() {
        this.blocks = new HashMap<>();
        blocks.put(0, new Block(0,
                0,
                3,
                "Локация: очнулся в каюте ",
            new Button("кричать ","нет ответа", false, false ),
            new Button("попытаться выбраться срочно ","проник в вент шахту", false, false ),
            new Button("спокойно подумать и осмотреться ","нашел ключ и вышел в коридор", false, false )
        ));
        blocks.put(1, new Block(1,
                1,
                3,
                "Локация: в вент шахте ",
            new Button("налево через большой вентилятор ","не удалось, получил удар, вернулся назад", true, false ),
            new Button("прямо по вент шахте на свет ","попал на склад", false, false ),
            new Button("направо в темноту ","попал в коридор", true, true )
        ));

        //not rdy
        blocks.put(2, new Block(2,
                2,
                3,
                "Локация: в коридоре ",
                new Button("о1 ","1", false, false ),
                new Button("о2 ","2", false, false ),
                new Button("о3 ","3", false, false )
        ));
        blocks.put(3, new Block(3,
                3,
                3,
                "Локация: на складе ",
                new Button("о1 ","1", false, false ),
                new Button("о2 ","2", false, false ),
                new Button("о3 ","3", false, false )
        ));






    }

    public Map<Integer, Block> getField() {
        return blocks;
    }

}
