package com.github.henriqueluz.challenges.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Deck {

    public List<Card> shuffle() {
        List<Card> cards = new ArrayList<>();
        Stream.of(Rank.values())
                .forEach(rank -> cards.addAll(buildAllCardsForRank(rank)));

        Collections.shuffle(cards);
        return cards;
    }

    private static List<Card> buildAllCardsForRank(Rank rank) {
        return Arrays.asList(
                new Card(rank, Suit.SPADES),
                new Card(rank, Suit.DIAMONDS),
                new Card(rank, Suit.HEARTS),
                new Card(rank, Suit.CLUBS)
        );
    }
}
