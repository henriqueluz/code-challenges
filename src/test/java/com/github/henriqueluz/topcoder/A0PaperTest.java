package com.github.henriqueluz.topcoder;

import org.junit.Assert;
import org.junit.Test;

public class A0PaperTest {

    private static final String POSSIBLE = "Possible";
    private static final String IMPOSSIBLE = "Impossible";

    @Test
    public void shouldBuildA0PaperWhenStackOfA0IsAvailable() {
        Assert.assertEquals(POSSIBLE, A0Paper.canBuild(new int []{1, 0, 2, 3}));
    }

    @Test
    public void shouldNotBuildA0PaperWhenPaperStackIsEmpty() {
        Assert.assertEquals(IMPOSSIBLE, A0Paper.canBuild(new int []{0, 0, 0, 0}));
    }

    @Test
    public void shouldBuildA0PaperWhenStackOfA1HasAtLeast2Papers() {
        Assert.assertEquals(POSSIBLE, A0Paper.canBuild(new int []{0, 2, 0, 1}));
    }

    @Test
    public void shouldBuildA0PaperWhenStackOfA2HasAtLeast4Papers() {
        Assert.assertEquals(POSSIBLE, A0Paper.canBuild(new int []{0, 0, 4, 1}));
    }

    @Test
    public void shouldBuildA0PaperWhenStackOfA1Has1PapersAndA2Has2Papers() {
        Assert.assertEquals(POSSIBLE, A0Paper.canBuild(new int []{0, 1, 2, 0}));
    }

    @Test
    public void shouldNotBuildA0PaperWhenStackOfA4Has15Papers() {
        Assert.assertEquals(IMPOSSIBLE, A0Paper.canBuild(new int []{0, 0, 0, 0, 15}));
    }

    @Test
    public void shouldBuildA0PaperForAnOrdinaryAmountOfPapers() {
        Assert.assertEquals(POSSIBLE, A0Paper.canBuild(new int []{2,0,0,0,0,0,0,3,2,0,0,5,0,3,0,0,1,0,0,0,5}));
    }

}