package com.example.javarushmodule3questgame.text;

import java.util.Objects;

public class Block {
    private final int block;
    private final int stage;
    private final int buttons;
    private final String text;
    private final String button1;
    private final String button2;
    private final String button3;

    public Block(int block, int stage, int buttons,  String text, String button1, String button2, String button3) {
        this.block = block;
        this.stage = stage;
        this.buttons = buttons;
        this.text = text;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
    }

    public int getBlock() {
        return block;
    }
    public int getStage() {
        return stage;
    }

    public int getButtons() {
        return buttons;
    }

    public String getText() {
        return text;
    }

    public String getButton1() {
        return button1;
    }

    public String getButton2() {
        return button2;
    }

    public String getButton3() {
        return button3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block1 = (Block) o;
        return block == block1.block && stage == block1.stage && buttons == block1.buttons && Objects.equals(text, block1.text) && Objects.equals(button1, block1.button1) && Objects.equals(button2, block1.button2) && Objects.equals(button3, block1.button3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, stage, buttons, text, button1, button2, button3);
    }
}
