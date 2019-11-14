package com.github.henriqueluz.challenges.cards;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static com.github.henriqueluz.challenges.cards.Rank.ACE;
import static com.github.henriqueluz.challenges.cards.Suit.CLUBS;
import static com.github.henriqueluz.challenges.cards.Suit.DIAMONDS;
import static com.github.henriqueluz.challenges.cards.Suit.HEARTS;
import static com.github.henriqueluz.challenges.cards.Suit.SPADES;
import static org.assertj.core.api.Assertions.assertThat;

public class RankTest {

    @Test
    public void getFourCardsForAGivenRank() {
        int expectedNumberOfCards = 4;
        List<Card> aceCards = ACE.getAllCardsForRank();

        assertThat(aceCards.size()).isEqualTo(expectedNumberOfCards);
    }

    @Test
    public void allSuitsShouldBePresentForAGivenRank() {
        List<Suit> aceSuits = ACE.getAllCardsForRank()
                .stream()
                .map(Card::getSuit)
                .collect(Collectors.toList());

        assertThat(aceSuits).containsExactlyInAnyOrder(DIAMONDS, CLUBS, HEARTS, SPADES);
    }

}