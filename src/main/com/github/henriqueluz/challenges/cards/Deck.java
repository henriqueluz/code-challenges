package com.github.henriqueluz.challenges.cards;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class Deck {

    private final Deque<Card> cards;

    public Deck() {
        this.cards = new ArrayDeque<>();
    }

    public Deque<Card> shuffle() {
        return null;
    }

    public void init() {
        Card.CardBuilder card = Card.builder();
        Stream.of(Rank.values()).forEach(
                rank -> cards.addAll(card.rank(rank).build().initRank())
        );
    }
}
