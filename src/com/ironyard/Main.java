package com.ironyard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shoe gameShoe = new Shoe();
        gameShoe.setNumDecks(8);
        gameShoe.setIndex(1);
        //need a setYellow at a random location for shoe to end
        gameShoe.load();
        gameShoe.shuffle();
    }
}
