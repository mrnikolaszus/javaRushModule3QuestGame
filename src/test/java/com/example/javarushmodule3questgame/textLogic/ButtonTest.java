package com.example.javarushmodule3questgame.textLogic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {
    static Button button;
    @BeforeAll
    static void init(){
        button = new Button("test", "test", false, false);

    }


    @ParameterizedTest
    @NullAndEmptySource
    public void nullNameShouldThrowIllegalArgumentExceptionTest(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Button(name, "test", false, false));
    }

    @ParameterizedTest
    @NullSource
    public void nullButtonNameShouldThrowTextNameCannotBeNullTest(String name) {
        try {
            new Button(name, "test", false, false);
        } catch (IllegalArgumentException e) {
            assertEquals("buttonName cannot be null.", e.getMessage());
        }
    }
    @ParameterizedTest
    @EmptySource
    public void blankButtonNameShouldThrowTextNameCannotBeBlankTest(String name) {
        try {
            new Button(name, "test", false, false);
        } catch (IllegalArgumentException e) {
            assertEquals("buttonName cannot be blank.", e.getMessage());
        }

    }


    @ParameterizedTest
    @NullAndEmptySource
    public void nullButtonResultShouldThrowIllegalArgumentExceptionTest(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Button("test", name, false, false));
    }

    @ParameterizedTest
    @NullSource
    public void nullButtonResultShouldThrowTextNameCannotBeNullTest(String name) {
        try {
            new Button("test", name, false, false);
        } catch (IllegalArgumentException e) {
            assertEquals("buttonResult cannot be null.", e.getMessage());
        }
    }

    @ParameterizedTest
    @EmptySource
    public void blankButtonResultShouldThrowTextNameCannotBeBlankTest(String name) {
        try {
            new Button("test", name, false, false);
        } catch (IllegalArgumentException e) {
            assertEquals("buttonResult cannot be blank.", e.getMessage());
        }
    }


        @Test
    void getButtonShouldReturnStringClassTest() {
            assertEquals(button.getButton().getClass(), String.class);

    }

    @Test
    void getButtonResultShouldReturnStringClassTest() {
        assertEquals(button.getButtonResult().getClass(), String.class);
    }

    @Test
    void isButtonDmgShouldReturnFalseTest() {
        assertEquals(button.isButtonDmg(), false);
    }

    @Test
    void isButtonShouldReturnFalseTest() {
        assertEquals(button.isButtonDeath(), false);
    }

    @Test
    void buttonConstructorAndGettersTest() {
        String buttonName = "Button 1";
        String buttonResult = "Result 1";
        boolean buttonDmg = true;
        boolean buttonDeath = true;

        Button button = new Button(buttonName, buttonResult, buttonDmg, buttonDeath);

        assertEquals(buttonName, button.getButton());
        assertEquals(buttonResult, button.getButtonResult());
        assertEquals(buttonDmg, button.isButtonDmg());
        assertEquals(buttonDeath, button.isButtonDeath());
    }

    @Test
    void buttonEqualityTest() {
        Button button1 = new Button("Button 1", "Result 1", true, true);
        Button button2 = new Button("Button 1", "Result 1", true, true);
        Button button3 = new Button("Button 2", "Result 2", false, false);

        // button1 and button2 have the same values, so they should be equal
        assertEquals(button1, button2);

        // button1 and button3 have different values, so they should not be equal
        assertNotEquals(button1, button3);
    }

    @Test
    void buttonHashCodeTest() {
        Button button1 = new Button("Button 1", "Result 1", true, true);
        Button button2 = new Button("Button 1", "Result 1", true, true);

        // button1 and button2 have the same values, so their hash codes should be equal
        assertEquals(button1.hashCode(), button2.hashCode());
    }


}