package com.github.henriqueluz.challenges;

import org.junit.Assert;
import org.junit.Test;

public class PolishReverseNotationTest {


    @Test
    public void shouldCalculateAGivenSentence() {
        String sentence = "3 2 *";
        Integer expected = 6;
        Assert.assertEquals(expected, PolishReverseNotation.calc(sentence));
    }

}