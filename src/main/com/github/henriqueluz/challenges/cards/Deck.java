package com.github.henriqueluz.challenges.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
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
        return Stream.of(Suit.values())
                .map(suit -> new Card(rank, suit))
                .collect(Collectors.toList());
    }
}
