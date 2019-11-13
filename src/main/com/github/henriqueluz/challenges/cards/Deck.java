package com.github.henriqueluz.challenges.cards;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
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
        Stream.of(Rank.values()).forEach(
                rank -> cards.addAll(buildCardsForRank(rank))
        );
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Integer size() {
        return cards.size();
    }

    private static Set<Card> buildCardsForRank(Rank rank) {
        return new HashSet<Card>() {{
            add(new Card(rank, Suit.SPADES));
            add(new Card(rank, Suit.DIAMONDS));
            add(new Card(rank, Suit.HEARTS));
            add(new Card(rank, Suit.CLUBS));
        }};
    }
}
