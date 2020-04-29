package com.github.henriqueluz.challenges.cards;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Rank {

    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public List<Card> getAllCardsForRank() {
        return Stream.of(Suit.values())
                .map(suit -> new Card(this, suit))
                .collect(Collectors.toList());
    }
}
