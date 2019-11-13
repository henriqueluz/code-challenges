package com.github.henriqueluz.challenges.cards;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckTest {

    @Test
    public void shouldShuffleDeck() {
        Deck deck = new Deck();
        List<Card> first = deck.shuffle();
        List<Card> second = deck.shuffle();

        assertThat(first).isNotEqualTo(second);
    }
}