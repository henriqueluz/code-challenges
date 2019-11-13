package com.github.henriqueluz.challenges.cards;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode
@Builder
public class Card {

    private final Rank rank;
    private Suit suit;

    public Set<Card> initRank() {
        return new HashSet<Card>() {{
            add(builder().rank(rank).suit(Suit.SPADES).build());
            add(builder().rank(rank).suit(Suit.DIAMONDS).build());
            add(builder().rank(rank).suit(Suit.HEARTS).build());
            add(builder().rank(rank).suit(Suit.CLUBS).build());
        }};
    }

}
