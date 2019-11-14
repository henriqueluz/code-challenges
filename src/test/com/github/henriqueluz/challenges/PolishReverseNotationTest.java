package com.github.henriqueluz.challenges;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolishReverseNotationTest {


    @Test
    public void shouldCalculateAGivenSentence() {
        String sentence = "3 2 *";
        Integer expected = 6;
        assertThat(PolishReverseNotation.calc(sentence)).isEqualTo(expected);
    }

}