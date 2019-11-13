package com.github.henriqueluz.challenges.cards;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Card {

    private final Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s of %s]", rank, suit);
    }

}
