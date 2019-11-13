package com.github.henriqueluz.challenges.cards;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckTest {

    @Test
    public void shouldShuffleDeck() {
        int deckSize = 52;
        Deck deck = new Deck();
        List<Card> first = deck.shuffle();
        List<Card> second = deck.shuffle();

        assertThat(first.size()).isEqualTo(second.size()).isEqualTo(deckSize);
        assertThat(first).isNotEqualTo(second);
    }
}