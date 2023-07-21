
package com.example.javarushmodule3questgame.javaLogic;

public enum Sign {
    LIFE('♥'),
    DEATH('✘'),
    RESTART('R');

    private final char sign;

    Sign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}