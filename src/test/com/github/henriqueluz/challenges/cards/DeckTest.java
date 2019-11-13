package com.github.henriqueluz.challenges.cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckTest {

    @Test
    public void shouldInitEmptyDeck() {
        Deck deck = new Deck();

        assertThat(deck.isEmpty()).isTrue();
    }

    @Test
    public void shouldInitDeckWithCards() {
        Deck deck = new Deck();
        deck.init();

        assertThat(deck.isEmpty()).isFalse();
    }

    @Test
    public void shouldInitDeckWith52Cards() {
        int expectedSize = 52;
        Deck deck = new Deck();
        deck.init();

        assertThat(deck.size()).isEqualTo(expectedSize);
    }
}