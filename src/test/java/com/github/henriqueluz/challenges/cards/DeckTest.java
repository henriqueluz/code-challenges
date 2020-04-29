package com.github.henriqueluz.challenges.cards;

import org.junit.Test;

import java.util.Deque;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckTest {

    @Test
    public void shouldShuffleDeck() {
        int expectedDeckSize = 52;
        Deck cards = new Deck();
        Deque<Card> first = cards.shuffle();
        Deque<Card> second = cards.shuffle();

        assertThat(first.size()).isEqualTo(second.size()).isEqualTo(expectedDeckSize);
        assertThat(first).isNotEqualTo(second);
    }
}