package com.github.henriqueluz.challenges;

import org.junit.Assert;
import org.junit.Test;

public class PRNTest {


    @Test
    public void shouldCalculateAGivenSentence() {
        String sentence = "3 2 *";
        Integer expected = 6;
        Assert.assertEquals(expected, PRN.calc(sentence));
    }

}