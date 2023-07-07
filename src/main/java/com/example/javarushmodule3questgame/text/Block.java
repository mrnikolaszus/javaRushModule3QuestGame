package com.example.javarushmodule3questgame.text;

import java.util.Objects;

public class Block {
    private final int block;
    private final int stage;
    private final int buttons;
    private final String text;
    private final String button1;
    private final String button1result;
    private final String button2;
    private final String button2result;
    private final String button3;
    private final String button3result;

    public Block(int block, int stage, int buttons,  String text,  String button1, String button1result, String button2, String button2result, String button3, String button3result) {
        this.block = block;
        this.stage = stage;
        this.buttons = buttons;
        this.text = text;

        this.button1 = button1;
        this.button1result = button1result;
        this.button2 = button2;
        this.button2result = button2result;
        this.button3 = button3;
        this.button3result = button3result;
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



}
