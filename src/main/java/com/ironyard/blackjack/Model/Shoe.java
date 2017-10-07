package com.ironyard.blackjack.Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Shoe {
    int numDecks;
    int index;
    int yellow;
    List<Card> shoeCards;

    public Shoe() {

    }

    public int getNumDecks() {
        return numDecks;
    }

    public void setNumDecks(int numDecks) {
        this.numDecks = numDecks;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public void load() {
        List<String> suits = new ArrayList();
        suits.add("Hearts");
        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Spades");
        this.shoeCards = new ArrayList<>();
        for (int i = 0; i < this.numDecks; i++) {
            for(int j = 0; j < suits.size(); j++) {
                for (int k = 2; k < 11; k++) {
                    Card temp = new Card();
                    temp.setValue(k);
                    temp.setName(Integer.toString(k));
                    temp.setSuit(suits.get(j));
                    this.shoeCards.add(temp);
                }
                Card jack = new Card();
                jack.setValue(10);
                jack.setName("J");
                jack.setSuit(suits.get(j));
                Card queen = new Card();
                queen.setValue(10);
                queen.setName("Q");
                queen.setSuit(suits.get(j));
                Card king = new Card();
                king.setValue(10);
                king.setName("K");
                king.setSuit(suits.get(j));
                Card ace = new Card();
                ace.setValue(1);
                ace.setName("A");
                ace.setSuit(suits.get(j));
                this.shoeCards.add(jack);
                this.shoeCards.add(queen);
                this.shoeCards.add(king);
                this.shoeCards.add(ace);
            }
        }
    }

    public void shuffle() {
        Random r = new Random();
        int pent = r.nextInt(52) + 312;
        this.setYellow(pent);
        for (int i = this.shoeCards.size() - 1; i > 1; i--) {
            int num = r.nextInt(i);
            Card temp = this.shoeCards.get(num);
            Card last = this.shoeCards.get(i);
            this.shoeCards.remove(num);
            this.shoeCards.add(num, last);
            this.shoeCards.remove(i);
            this.shoeCards.add(i, temp);
        }
    }
}
