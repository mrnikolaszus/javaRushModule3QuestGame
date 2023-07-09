package com.example.javarushmodule3questgame.text;

import java.util.Objects;

public class Block {
    private final int block;
    private final int stage;
    private final int activeButtonsQnt;
    private final String text;
    private final Button buttonOne;
    private final Button buttonTwo;
    private final Button buttonThree;


    public Block(int block, int stage, int activeButtonsQnt,  String text, Button buttonOne, Button buttonTwo, Button buttonThree) {
        this.block = block;
        this.stage = stage;
        this.activeButtonsQnt = activeButtonsQnt;
        this.text = text;
        this.buttonOne = buttonOne;
        this.buttonTwo = buttonTwo;
        this.buttonThree = buttonThree;


    }

    public int getBlock() {
        return block;
    }
    public int getStage() {
        return stage;
    }

    public int getActiveButtonsQnt() {
        return activeButtonsQnt;
    }

    public String getText() {
        return text;
    }

    public Button getButtonOne() {
        return buttonOne;
    }

    public Button getButtonTwo() {
        return buttonTwo;
    }

    public Button getButtonThree() {
        return buttonThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block1 = (Block) o;
        return block == block1.block && stage == block1.stage && activeButtonsQnt == block1.activeButtonsQnt && Objects.equals(text, block1.text) && Objects.equals(buttonOne, block1.buttonOne) && Objects.equals(buttonTwo, block1.buttonTwo) && Objects.equals(buttonThree, block1.buttonThree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, stage, activeButtonsQnt, text, buttonOne, buttonTwo, buttonThree);
    }
}
