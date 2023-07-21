package com.example.javarushmodule3questgame.textLogic;

import com.example.javarushmodule3questgame.javaLogic.Sign;

import javax.servlet.http.HttpSession;

public class TextLogicGame {
    public static boolean gameLogic(String click, Integer currentBlock, HttpSession session, AllBlocks blocks) {

        //block0

        if (currentBlock == 0 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(0).getButtonOne().getButtonResult());
            session.setAttribute("text", "Дверь все еще заблокирована, вы слышите шум за дверью, чувство паники все больше охватывает Вас" );
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
            session.setAttribute("text2", blocks.getField().get(1).getButtonOne().getButtonResult());
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
            session.setAttribute("currentBlock", blocks.getField().get(3).getBlock());
            session.setAttribute("buttons", blocks.getField().get(3).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(3).getText());
            session.setAttribute("button1", blocks.getField().get(3).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(3).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(3).getButtonThree().getButton());
            if(blocks.getField().get(1).getButtonTwo().isButtonDeath()){
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(1).getButtonTwo().isButtonDmg(); //second button dmg?

        }
        if (currentBlock == 1 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(1).getButtonThree().getButtonResult());
            session.setAttribute("currentBlock", blocks.getField().get(2).getBlock());
            session.setAttribute("buttons", blocks.getField().get(2).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(2).getText());
            session.setAttribute("button1", blocks.getField().get(2).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(2).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(2).getButtonThree().getButton());
            if(blocks.getField().get(1).getButtonThree().isButtonDeath()){
            session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(1).getButtonThree().isButtonDmg(); //third button dmg?
        }

        //block2

        if (currentBlock == 2 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(2).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(1).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(1).getButtonThree().getButton());

            if(blocks.getField().get(2).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(2).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 2 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(2).getButtonTwo().getButtonResult());//this block result

            //move to other block
//            session.setAttribute("currentBlock", blocks.getField().get(2).getBlock());
//            session.setAttribute("buttons", blocks.getField().get(2).getActiveButtonsQnt());
//            session.setAttribute("text", blocks.getField().get(2).getText());
//            session.setAttribute("button1", blocks.getField().get(2).getButtonOne().getButton());
//            session.setAttribute("button2", blocks.getField().get(2).getButtonTwo().getButton());
//            session.setAttribute("button3", blocks.getField().get(2).getButtonThree().getButton());

            if(blocks.getField().get(2).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(2).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 2 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(2).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(4).getBlock());
            session.setAttribute("buttons", blocks.getField().get(4).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(4).getText());
            session.setAttribute("button1", blocks.getField().get(4).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(4).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(4).getButtonThree().getButton());

            if(blocks.getField().get(2).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(2).getButtonThree().isButtonDmg(); //this block result
        }

        //block3

        if (currentBlock == 3 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(3).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(10).getBlock());
            session.setAttribute("buttons", blocks.getField().get(10).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(10).getText());
            session.setAttribute("button1", blocks.getField().get(10).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(10).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(10).getButtonThree().getButton());

            if(blocks.getField().get(3).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(3).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 3 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(3).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(1).getBlock());
            session.setAttribute("buttons", blocks.getField().get(1).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(1).getText());
            session.setAttribute("button1", blocks.getField().get(1).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(1).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(1).getButtonThree().getButton());

            if(blocks.getField().get(3).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(3).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 3 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(3).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(9).getBlock());
            session.setAttribute("buttons", blocks.getField().get(9).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(9).getText());
            session.setAttribute("button1", blocks.getField().get(9).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(9).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(9).getButtonThree().getButton());

            if(blocks.getField().get(3).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(3).getButtonThree().isButtonDmg(); //this block result
        }

        //block4

        if (currentBlock == 4 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(4).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(5).getBlock());
            session.setAttribute("buttons", blocks.getField().get(5).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(5).getText());
            session.setAttribute("button1", blocks.getField().get(5).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(5).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(5).getButtonThree().getButton());

            if(blocks.getField().get(4).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(4).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 4 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(4).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(2).getBlock());
            session.setAttribute("buttons", blocks.getField().get(2).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(2).getText());
            session.setAttribute("button1", blocks.getField().get(2).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(2).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(2).getButtonThree().getButton());

            if(blocks.getField().get(4).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(4).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 4 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(4).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(9).getBlock());
            session.setAttribute("buttons", blocks.getField().get(9).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(9).getText());
            session.setAttribute("button1", blocks.getField().get(9).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(9).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(9).getButtonThree().getButton());

            if(blocks.getField().get(4).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(4).getButtonThree().isButtonDmg(); //this block result
        }

        //block5

        if (currentBlock == 5 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(5).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(4).getBlock());
            session.setAttribute("buttons", blocks.getField().get(4).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(4).getText());
            session.setAttribute("button1", blocks.getField().get(4).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(4).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(4).getButtonThree().getButton());

            if(blocks.getField().get(5).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(5).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 5 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(5).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(5).getBlock());
            session.setAttribute("buttons", blocks.getField().get(5).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(5).getText());
            session.setAttribute("button1", blocks.getField().get(5).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(5).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(5).getButtonThree().getButton());

            if(blocks.getField().get(5).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(5).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 5 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(5).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(6).getBlock());
            session.setAttribute("buttons", blocks.getField().get(6).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(6).getText());
            session.setAttribute("button1", blocks.getField().get(6).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(6).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(6).getButtonThree().getButton());

            if(blocks.getField().get(5).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(5).getButtonThree().isButtonDmg(); //this block result
        }
        //block6

        if (currentBlock == 6 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(6).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(4).getBlock());
            session.setAttribute("buttons", blocks.getField().get(4).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(4).getText());
            session.setAttribute("button1", blocks.getField().get(4).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(4).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(4).getButtonThree().getButton());

            if(blocks.getField().get(6).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(6).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 6 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(6).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(7).getBlock());
            session.setAttribute("buttons", blocks.getField().get(7).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(7).getText());
            session.setAttribute("button1", blocks.getField().get(7).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(7).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(7).getButtonThree().getButton());

            if(blocks.getField().get(6).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(6).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 6 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(6).getButtonThree().getButtonResult()); //this block result

            //move to other block

            if(blocks.getField().get(6).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(6).getButtonThree().isButtonDmg(); //this block result
        }
        //block7

        if (currentBlock == 7 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(7).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(8).getBlock());
            session.setAttribute("buttons", blocks.getField().get(8).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(8).getText());
            session.setAttribute("button1", blocks.getField().get(8).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(8).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(8).getButtonThree().getButton());
            session.setAttribute("endRestart", Sign.RESTART);

            if(blocks.getField().get(7).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(7).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 7 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(7).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(8).getBlock());
            session.setAttribute("buttons", blocks.getField().get(8).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(8).getText());
            session.setAttribute("button1", blocks.getField().get(8).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(8).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(8).getButtonThree().getButton());
            session.setAttribute("endRestart", Sign.RESTART);

            if(blocks.getField().get(7).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(7).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 7 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(7).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(4).getBlock());
            session.setAttribute("buttons", blocks.getField().get(4).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(4).getText());
            session.setAttribute("button1", blocks.getField().get(4).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(4).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(4).getButtonThree().getButton());

            if(blocks.getField().get(7).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(7).getButtonThree().isButtonDmg(); //this block result
        }

        //block8

//        if (currentBlock == 8 && click.equals("1")) {
//            session.setAttribute("text2", blocks.getField().get(7).getButtonOne().getButtonResult()); //this block result
//
//            //move to other block
//            session.setAttribute("currentBlock", blocks.getField().get(8).getBlock());
//            session.setAttribute("buttons", blocks.getField().get(8).getActiveButtonsQnt());
//            session.setAttribute("text", blocks.getField().get(8).getText());
//            session.setAttribute("button1", blocks.getField().get(8).getButtonOne().getButton());
//            session.setAttribute("button2", blocks.getField().get(8).getButtonTwo().getButton());
//            session.setAttribute("button3", blocks.getField().get(8).getButtonThree().getButton());
//
//            if(blocks.getField().get(7).getButtonOne().isButtonDeath()){  //this block result
//                session.setAttribute("status", Sign.DEATH); }
//            return blocks.getField().get(7).getButtonOne().isButtonDmg();  //this block result
//
//        }
//        if (currentBlock == 7 && click.equals("2")) {
//            session.setAttribute("text2", blocks.getField().get(7).getButtonTwo().getButtonResult());//this block result
//
////            move to other block
//            session.setAttribute("currentBlock", blocks.getField().get(8).getBlock());
//            session.setAttribute("buttons", blocks.getField().get(8).getActiveButtonsQnt());
//            session.setAttribute("text", blocks.getField().get(8).getText());
//            session.setAttribute("button1", blocks.getField().get(8).getButtonOne().getButton());
//            session.setAttribute("button2", blocks.getField().get(8).getButtonTwo().getButton());
//            session.setAttribute("button3", blocks.getField().get(8).getButtonThree().getButton());
//
//            if(blocks.getField().get(7).getButtonTwo().isButtonDeath()){ //this block result
//                session.setAttribute("status", Sign.DEATH); }
//            return blocks.getField().get(7).getButtonTwo().isButtonDmg(); //this block result
//
//        }
//        if (currentBlock == 7 && click.equals("3")) {
//            session.setAttribute("text2", blocks.getField().get(7).getButtonThree().getButtonResult()); //this block result
//
//            //move to other block
//            session.setAttribute("currentBlock", blocks.getField().get(4).getBlock());
//            session.setAttribute("buttons", blocks.getField().get(4).getActiveButtonsQnt());
//            session.setAttribute("text", blocks.getField().get(4).getText());
//            session.setAttribute("button1", blocks.getField().get(4).getButtonOne().getButton());
//            session.setAttribute("button2", blocks.getField().get(4).getButtonTwo().getButton());
//            session.setAttribute("button3", blocks.getField().get(4).getButtonThree().getButton());
//
//            if(blocks.getField().get(7).getButtonThree().isButtonDeath()){ //this block result
//                session.setAttribute("status", Sign.DEATH); }
//            return blocks.getField().get(7).getButtonThree().isButtonDmg(); //this block result
//        }

        //block9

        if (currentBlock == 9 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(9).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(4).getBlock());
            session.setAttribute("buttons", blocks.getField().get(4).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(4).getText());
            session.setAttribute("button1", blocks.getField().get(4).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(4).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(4).getButtonThree().getButton());

            if(blocks.getField().get(9).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(9).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 9 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(9).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(3).getBlock());
            session.setAttribute("buttons", blocks.getField().get(3).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(3).getText());
            session.setAttribute("button1", blocks.getField().get(3).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(3).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(3).getButtonThree().getButton());

            if(blocks.getField().get(9).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(9).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 9 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(9).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(17).getBlock());
            session.setAttribute("buttons", blocks.getField().get(17).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(17).getText());
            session.setAttribute("button1", blocks.getField().get(17).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(17).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(17).getButtonThree().getButton());

            if(blocks.getField().get(9).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(9).getButtonThree().isButtonDmg(); //this block result
        }
        //block10

        if (currentBlock == 10 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(10).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(3).getBlock());
            session.setAttribute("buttons", blocks.getField().get(3).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(3).getText());
            session.setAttribute("button1", blocks.getField().get(3).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(3).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(3).getButtonThree().getButton());

            if(blocks.getField().get(10).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(10).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 10 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(10).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(11).getBlock());
            session.setAttribute("buttons", blocks.getField().get(11).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(11).getText());
            session.setAttribute("button1", blocks.getField().get(11).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(11).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(11).getButtonThree().getButton());

            if(blocks.getField().get(10).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(10).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 10 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(10).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(15).getBlock());
            session.setAttribute("buttons", blocks.getField().get(15).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(15).getText());
            session.setAttribute("button1", blocks.getField().get(15).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(15).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(15).getButtonThree().getButton());

            if(blocks.getField().get(10).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(10).getButtonThree().isButtonDmg(); //this block result
        }

        //block11

        if (currentBlock == 11 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(11).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(10).getBlock());
            session.setAttribute("buttons", blocks.getField().get(10).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(10).getText());
            session.setAttribute("button1", blocks.getField().get(10).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(10).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(10).getButtonThree().getButton());

            if(blocks.getField().get(11).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(11).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 11 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(11).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(12).getBlock());
            session.setAttribute("buttons", blocks.getField().get(12).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(12).getText());
            session.setAttribute("button1", blocks.getField().get(12).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(12).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(12).getButtonThree().getButton());

            if(blocks.getField().get(11).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(11).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 11 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(11).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(15).getBlock());
            session.setAttribute("buttons", blocks.getField().get(15).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(15).getText());
            session.setAttribute("button1", blocks.getField().get(15).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(15).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(15).getButtonThree().getButton());

            if(blocks.getField().get(11).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(11).getButtonThree().isButtonDmg(); //this block result
        }
        //block12

        if (currentBlock == 12 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(12).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(11).getBlock());
            session.setAttribute("buttons", blocks.getField().get(11).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(11).getText());
            session.setAttribute("button1", blocks.getField().get(11).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(11).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(11).getButtonThree().getButton());

            if(blocks.getField().get(12).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(12).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 12 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(12).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(13).getBlock());
            session.setAttribute("buttons", blocks.getField().get(13).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(13).getText());
            session.setAttribute("button1", blocks.getField().get(13).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(13).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(13).getButtonThree().getButton());

            if(blocks.getField().get(12).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(12).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 12 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(12).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(14).getBlock());
            session.setAttribute("buttons", blocks.getField().get(14).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(14).getText());
            session.setAttribute("button1", blocks.getField().get(14).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(14).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(14).getButtonThree().getButton());

            if(blocks.getField().get(12).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(12).getButtonThree().isButtonDmg(); //this block result
        }

        //block13

        if (currentBlock == 13 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(13).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(12).getBlock());
            session.setAttribute("buttons", blocks.getField().get(12).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(12).getText());
            session.setAttribute("button1", blocks.getField().get(12).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(12).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(12).getButtonThree().getButton());

            if(blocks.getField().get(13).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(13).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 13 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(13).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(14).getBlock());
            session.setAttribute("buttons", blocks.getField().get(14).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(14).getText());
            session.setAttribute("button1", blocks.getField().get(14).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(14).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(14).getButtonThree().getButton());

            if(blocks.getField().get(13).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(13).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 13 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(13).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(16).getBlock());
            session.setAttribute("buttons", blocks.getField().get(16).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(16).getText());
            session.setAttribute("button1", blocks.getField().get(16).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(16).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(16).getButtonThree().getButton());

            if(blocks.getField().get(13).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(13).getButtonThree().isButtonDmg(); //this block result
        }
        //block14

        if (currentBlock == 14 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(14).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(12).getBlock());
            session.setAttribute("buttons", blocks.getField().get(12).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(12).getText());
            session.setAttribute("button1", blocks.getField().get(12).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(12).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(12).getButtonThree().getButton());

            if(blocks.getField().get(14).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(14).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 14 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(14).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(13).getBlock());
            session.setAttribute("buttons", blocks.getField().get(13).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(13).getText());
            session.setAttribute("button1", blocks.getField().get(13).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(13).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(13).getButtonThree().getButton());

            if(blocks.getField().get(14).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(14).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 14 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(14).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(16).getBlock());
            session.setAttribute("buttons", blocks.getField().get(16).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(16).getText());
            session.setAttribute("button1", blocks.getField().get(16).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(16).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(16).getButtonThree().getButton());

            if(blocks.getField().get(14).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(14).getButtonThree().isButtonDmg(); //this block result
        }
        //block15

        if (currentBlock == 15 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(15).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(10).getBlock());
            session.setAttribute("buttons", blocks.getField().get(10).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(10).getText());
            session.setAttribute("button1", blocks.getField().get(10).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(10).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(10).getButtonThree().getButton());

            if(blocks.getField().get(15).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(15).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 15 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(15).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(11).getBlock());
            session.setAttribute("buttons", blocks.getField().get(11).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(11).getText());
            session.setAttribute("button1", blocks.getField().get(11).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(11).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(11).getButtonThree().getButton());

            if(blocks.getField().get(15).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(15).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 15 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(15).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(15).getBlock());
            session.setAttribute("buttons", blocks.getField().get(15).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(15).getText());
            session.setAttribute("button1", blocks.getField().get(15).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(15).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(15).getButtonThree().getButton());

            if(blocks.getField().get(15).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(15).getButtonThree().isButtonDmg(); //this block result
        }
        //block16

        if (currentBlock == 16 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(16).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(13).getBlock());
            session.setAttribute("buttons", blocks.getField().get(13).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(13).getText());
            session.setAttribute("button1", blocks.getField().get(13).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(13).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(13).getButtonThree().getButton());

            if(blocks.getField().get(16).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(16).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 16 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(16).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(14).getBlock());
            session.setAttribute("buttons", blocks.getField().get(14).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(14).getText());
            session.setAttribute("button1", blocks.getField().get(14).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(14).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(14).getButtonThree().getButton());

            if(blocks.getField().get(16).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(16).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 16 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(16).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(17).getBlock());
            session.setAttribute("buttons", blocks.getField().get(17).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(17).getText());
            session.setAttribute("button1", blocks.getField().get(17).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(17).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(17).getButtonThree().getButton());

            if(blocks.getField().get(16).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(16).getButtonThree().isButtonDmg(); //this block result
        }
        //block17

        if (currentBlock == 17 && click.equals("1")) {
            session.setAttribute("text2", blocks.getField().get(17).getButtonOne().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(16).getBlock());
            session.setAttribute("buttons", blocks.getField().get(16).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(16).getText());
            session.setAttribute("button1", blocks.getField().get(16).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(16).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(16).getButtonThree().getButton());

            if(blocks.getField().get(17).getButtonOne().isButtonDeath()){  //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(17).getButtonOne().isButtonDmg();  //this block result

        }
        if (currentBlock == 17 && click.equals("2")) {
            session.setAttribute("text2", blocks.getField().get(17).getButtonTwo().getButtonResult());//this block result

//            move to other block
            session.setAttribute("currentBlock", blocks.getField().get(9).getBlock());
            session.setAttribute("buttons", blocks.getField().get(9).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(9).getText());
            session.setAttribute("button1", blocks.getField().get(9).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(9).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(9).getButtonThree().getButton());

            if(blocks.getField().get(17).getButtonTwo().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(17).getButtonTwo().isButtonDmg(); //this block result

        }
        if (currentBlock == 17 && click.equals("3")) {
            session.setAttribute("text2", blocks.getField().get(17).getButtonThree().getButtonResult()); //this block result

            //move to other block
            session.setAttribute("currentBlock", blocks.getField().get(17).getBlock());
            session.setAttribute("buttons", blocks.getField().get(17).getActiveButtonsQnt());
            session.setAttribute("text", blocks.getField().get(17).getText());
            session.setAttribute("button1", blocks.getField().get(17).getButtonOne().getButton());
            session.setAttribute("button2", blocks.getField().get(17).getButtonTwo().getButton());
            session.setAttribute("button3", blocks.getField().get(17).getButtonThree().getButton());

            if(blocks.getField().get(17).getButtonThree().isButtonDeath()){ //this block result
                session.setAttribute("status", Sign.DEATH); }
            return blocks.getField().get(17).getButtonThree().isButtonDmg(); //this block result
        }
        return false;

    }


}
