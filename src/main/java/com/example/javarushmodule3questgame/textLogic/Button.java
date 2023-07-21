package com.example.javarushmodule3questgame.textLogic;

import com.example.javarushmodule3questgame.javaLogic.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Button {
    private static final Logger logger = LogManager.getLogger(Button.class);
    private final String button;
    private final String buttonResult;

    private final boolean buttonDmg;

    //if death is instant = button dmg should be true
    private final boolean buttonDeath;

    public Button(String button, String buttonResult, boolean buttonDmg, boolean buttonDeath) {
        if (isNull(button)) {
            logger.error("buttonName is null");
            throw new IllegalArgumentException("buttonName cannot be null.");
        } else if (button.isBlank()) {
            logger.error("buttonName is blank");
            throw new IllegalArgumentException("buttonName cannot be blank.");
        }

        if (isNull(buttonResult)) {
            logger.error("buttonResult is null");
            throw new IllegalArgumentException("buttonResult cannot be null.");
        } else if (buttonResult.isBlank()) {
            logger.error("buttonResult is blank");
            throw new IllegalArgumentException("buttonResult cannot be blank.");
        }


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
