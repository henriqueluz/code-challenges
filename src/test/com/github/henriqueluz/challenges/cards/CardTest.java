package com.github.henriqueluz.challenges.cards;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static com.github.henriqueluz.challenges.cards.Rank.ACE;
import static com.github.henriqueluz.challenges.cards.Rank.KING;
import static com.github.henriqueluz.challenges.cards.Suit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    public void shouldInitRankOfCards() {
        Card.CardBuilder builder = Card.builder();
        Set<Card> aces = builder.rank(ACE).build().initRank();

        List<Card> expected = Arrays.asList(
                builder.rank(ACE).suit(DIAMONDS).build(),
                builder.rank(ACE).suit(CLUBS).build(),
                builder.rank(ACE).suit(SPADES).build(),
                builder.rank(ACE).suit(HEARTS).build()
        );

        assertThat(aces.containsAll(expected)).isTrue();
    }

    @Test
    public void shouldNotContainAnotherRankOfCards() {
        Card.CardBuilder builder = Card.builder();
        Set<Card> aces = builder.rank(KING).build().initRank();

        assertThat(aces.contains(builder.rank(ACE).suit(DIAMONDS).build())).isFalse();
    }
}