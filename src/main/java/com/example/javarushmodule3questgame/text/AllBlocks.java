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
                "очнулся",

                "option1 ",
                "option1result",
                "option2 ",
                "option2result",
                "option3 ",
                "option3result"
        ));
        blocks.put(1, new Block(1,
                1,
                3,
                "в коридоре",
                "option1 ",
                "option1result",
                "option2 ",
                "option2result",
                "option3 ",
                "option3result"
        ));
        blocks.put(2, new Block(2,
                1,
                3,
                "Cabin3",
                "option1 ",
                "option1result",
                "option2 ",
                "option2result",
                "option3 ",
                "option3result"
        ));


    }

    public Map<Integer, Block> getField() {
        return blocks;
    }

}
