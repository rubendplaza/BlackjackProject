package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        //FIX THIS
    }

    @Override
    public boolean hitMe() {
        //FIX THIS
        return false;
    }

    @Override
    public void gameOver() {
        //FIX THIS
    }

}