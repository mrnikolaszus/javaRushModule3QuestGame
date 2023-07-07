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
                "Вы очнулись на полу, кажется это склад, ваша голова раскалывается от боли, во рту привкус крови. Осмотревшись вы видите",

                "Попытаться позвать на помощь. ",
                "Попытаться проникнуть в вентиляционную шахту ",
                "Обыскать комнату. "
        ));
        blocks.put(1, new Block(1,
                0,
                3,
                "Cabin2",
                "go ",
                "go ",
                "go e"
        ));
        blocks.put(2, new Block(1,
                0,
                3,
                "Cabin3",
                "go ",
                "go ",
                "go "
        ));


    }

    public Map<Integer, Block> getField() {
        return blocks;
    }

}
