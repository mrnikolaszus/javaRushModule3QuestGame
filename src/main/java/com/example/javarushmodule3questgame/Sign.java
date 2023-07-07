package com.example.javarushmodule3questgame;

public enum Sign {
    LIFE('♥'),
    DEATH('✘');

    private final char sign;

    Sign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}