package com.github.henriqueluz.challenges;

import com.github.henriqueluz.challenges.algorithms.PolishReverseNotationCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolishReverseNotationTest {

    @Test
    public void shouldCalculateAGivenSentence() {
        String sentence = "3 2 *";
        Integer expected = 6;
        assertThat(PolishReverseNotationCalculator.apply(sentence)).isEqualTo(expected);
    }

}