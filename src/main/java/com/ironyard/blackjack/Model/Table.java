package com.ironyard.blackjack.Model;

import java.util.List;

public class Table {
    private List<Player> players;
    private Dealer dealer;
    private boolean endHand;

    public Table() {
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public boolean isEndHand() {
        return endHand;
    }

    public void setEndHand(boolean endHand) {
        this.endHand = endHand;
    }
}
