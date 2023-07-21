package com.example.javarushmodule3questgame.textLogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {

    @Test
    void testGetBlock() {
        int block = 1;
        Block blockInstance = new Block(block, 2, 3, "Test Block",
                new Button("Button 1", "Result 1", true, true),
                new Button("Button 2", "Result 2", false, false),
                new Button("Button 3", "Result 3", true, false));

        assertEquals(block, blockInstance.getBlock());
    }

    @Test
    void testGetStage() {
        int stage = 2;
        Block blockInstance = new Block(1, stage, 3, "Test Block",
                new Button("Button 1", "Result 1", true, true),
                new Button("Button 2", "Result 2", false, false),
                new Button("Button 3", "Result 3", true, false));

        assertEquals(stage, blockInstance.getStage());
    }

    @Test
    void testGetActiveButtonsQnt() {
        int activeButtonsQnt = 3;
        Block blockInstance = new Block(1, 2, activeButtonsQnt, "Test Block",
                new Button("Button 1", "Result 1", true, true),
                new Button("Button 2", "Result 2", false, false),
                new Button("Button 3", "Result 3", true, false));

        assertEquals(activeButtonsQnt, blockInstance.getActiveButtonsQnt());
    }

    @Test
    void testGetText() {
        String text = "Test Block";
        Block blockInstance = new Block(1, 2, 3, text,
                new Button("Button 1", "Result 1", true, true),
                new Button("Button 2", "Result 2", false, false),
                new Button("Button 3", "Result 3", true, false));

        assertEquals(text, blockInstance.getText());
    }

    @Test
    void testGetButtonOne() {
        Button buttonOne = new Button("Button 1", "Result 1", true, true);
        Block blockInstance = new Block(1, 2, 3, "Test Block",
                buttonOne,
                new Button("Button 2", "Result 2", false, false),
                new Button("Button 3", "Result 3", true, false));

        assertEquals(buttonOne, blockInstance.getButtonOne());
    }

    @Test
    void testGetButtonTwo() {
        Button buttonTwo = new Button("Button 2", "Result 2", false, false);
        Block blockInstance = new Block(1, 2, 3, "Test Block",
                new Button("Button 1", "Result 1", true, true),
                buttonTwo,
                new Button("Button 3", "Result 3", true, false));

        assertEquals(buttonTwo, blockInstance.getButtonTwo());
    }

    @Test
    void testGetButtonThree() {
        Button buttonThree = new Button("Button 3", "Result 3", true, false);
        Block blockInstance = new Block(1, 2, 3, "Test Block",
                new Button("Button 1", "Result 1", true, true),
                new Button("Button 2", "Result 2", false, false),
                buttonThree);

        assertEquals(buttonThree, blockInstance.getButtonThree());
    }

    @Test
    void testBlockEquality() {
        Button buttonOne = new Button("Button 1", "Result 1", true, true);
        Button buttonTwo = new Button("Button 2", "Result 2", false, false);
        Button buttonThree = new Button("Button 3", "Result 3", true, false);

        Block block1 = new Block(1, 2, 3, "Test Block", buttonOne, buttonTwo, buttonThree);
        Block block2 = new Block(1, 2, 3, "Test Block", buttonOne, buttonTwo, buttonThree);
        Block block3 = new Block(4, 5, 6, "Another Block", buttonOne, buttonTwo, buttonThree);

        // block1 and block2 have the same values, so they should be equal
        assertEquals(block1, block2);

        // block1 and block3 have different values, so they should not be equal
        assertNotEquals(block1, block3);
    }

    @Test
    void testBlockHashCode() {
        Button buttonOne = new Button("Button 1", "Result 1", true, true);
        Button buttonTwo = new Button("Button 2", "Result 2", false, false);
        Button buttonThree = new Button("Button 3", "Result 3", true, false);

        Block block1 = new Block(1, 2, 3, "Test Block", buttonOne, buttonTwo, buttonThree);
        Block block2 = new Block(1, 2, 3, "Test Block", buttonOne, buttonTwo, buttonThree);

        // block1 and block2 have the same values, so their hash codes should be equal
        assertEquals(block1.hashCode(), block2.hashCode());
    }

}