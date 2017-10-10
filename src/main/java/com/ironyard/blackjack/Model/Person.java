package com.ironyard.blackjack.Model;

public abstract class Person {
    private boolean hasAce;
    private boolean hasBlackJack;

    public Person() {
    }

    public boolean isHasAce() {
        return hasAce;
    }

    public void setHasAce(boolean hasAce) {
        this.hasAce = hasAce;
    }

    public boolean isHasBlackJack() {
        return hasBlackJack;
    }

    public void setHasBlackJack(boolean hasBlackJack) {
        this.hasBlackJack = hasBlackJack;
    }
}
