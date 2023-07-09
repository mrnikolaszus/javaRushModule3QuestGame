package com.example.javarushmodule3questgame.text;

import com.example.javarushmodule3questgame.Sign;

import javax.servlet.http.HttpSession;

public class TextLogicGame {
    public static boolean gameLogic(String click, Integer currentBlock, HttpSession session, AllBlocks blocks) {

        //block0

        if (currentBlock == 0 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(0).getButtonOne().getButtonResult());
            return blocks.getField().get(0).getButtonOne().isButtonDmg();
        }
        if (currentBlock == 0 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(0).getButtonTwo().getButtonResult());
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(1).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(1).getButtonThree().getButton());
            if(blocks.getField().get(0).getButtonTwo().isButtonDeath()){
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(0).getButtonTwo().isButtonDmg();

        }
        if (currentBlock == 0 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(0).getButtonThree().getButtonResult());
            session.setAttribute("currentBlock", blocks.getField().get(2).getBlock());
            session.setAttribute("buttons", blocks.getField().get(2).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(2).getText());
            session.setAttribute("button1", blocks.getField().get(2).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(2).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(2).getButtonThree().getButton());
            if(blocks.getField().get(0).getButtonThree().isButtonDeath()){
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(0).getButtonThree().isButtonDmg();
        }


        //block1

        if (currentBlock == 1 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(1).getButtonTwo().getButtonResult());
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(1).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(1).getButtonThree().getButton());
            if(blocks.getField().get(1).getButtonOne().isButtonDeath()){
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(1).getButtonOne().isButtonDmg();  //first button dmg?

        }
        if (currentBlock == 1 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(1).getButtonTwo().getButtonResult());
            session.setAttribute("currentBlock", blocks.getField().get(2).getBlock());
            session.setAttribute("buttons", blocks.getField().get(2).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(2).getText());
            session.setAttribute("button1", blocks.getField().get(2).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(2).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(2).getButtonThree().getButton());
            if(blocks.getField().get(1).getButtonTwo().isButtonDeath()){
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(1).getButtonTwo().isButtonDmg(); //second button dmg?

        }
        if (currentBlock == 1 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(1).getButtonThree().getButtonResult());
            session.setAttribute("currentBlock", blocks.getField().get(3).getBlock());
            session.setAttribute("buttons", blocks.getField().get(3).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(3).getText());
            session.setAttribute("button1", blocks.getField().get(3).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(3).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(3).getButtonThree().getButton());
            if(blocks.getField().get(1).getButtonThree().isButtonDeath()){
            session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(1).getButtonThree().isButtonDmg(); //third button dmg?
        }

        return false;
    }
}
