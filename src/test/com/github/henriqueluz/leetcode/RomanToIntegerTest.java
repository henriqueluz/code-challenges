package com.github.henriqueluz.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void shouldParseRomanTo1() {
        Assert.assertEquals(1, RomanToInteger.parse("I"));
    }

    @Test
    public void shouldParseRomanToII() {
        Assert.assertEquals(2, RomanToInteger.parse("II"));
    }

    @Test
    public void shouldParseRomanTo15() {
        Assert.assertEquals(15, RomanToInteger.parse("XV"));
    }

    @Test
    public void shouldParseRomanTo4() {
        Assert.assertEquals(4, RomanToInteger.parse("IV"));
    }

    @Test
    public void shouldParseRomanTo1994() {
        Assert.assertEquals(1994, RomanToInteger.parse("MCMXCIV"));
    }

}