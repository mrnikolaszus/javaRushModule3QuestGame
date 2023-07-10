package com.example.javarushmodule3questgame.textLogic;

import java.util.Objects;

public class Button {
    private final String button;
    private final String buttonResult;

    private final boolean buttonDmg;

    //if death is instant = button dmg should be true
    private final boolean buttonDeath;

    public Button(String button, String buttonResult, boolean buttonDmg, boolean buttonDeath) {
        this.button = button;
        this.buttonResult = buttonResult;
        this.buttonDmg = buttonDmg;
        this.buttonDeath = buttonDeath;
    }

    public String getButton() {
        return button;
    }

    public String getButtonResult() {
        return buttonResult;
    }

    public boolean isButtonDmg() {
        return buttonDmg;
    }

    public boolean isButtonDeath() {
        return buttonDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Button button1 = (Button) o;
        return buttonDmg == button1.buttonDmg && buttonDeath == button1.buttonDeath && Objects.equals(button, button1.button) && Objects.equals(buttonResult, button1.buttonResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(button, buttonResult, buttonDmg, buttonDeath);
    }
}
