package com.github.henriqueluz.challenges.cards;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

public class Deck {

    public Deque<Card> shuffle() {
        List<Card> cards = new ArrayList<>();
        Stream.of(Rank.values())
                .forEach(rank -> cards.addAll(rank.getAllCardsForRank()));
        Collections.shuffle(cards);

        return new ArrayDeque<>(cards);
    }

}
