package com.github.henriqueluz.challenges.algorithms.recursion;

import org.junit.Test;

public class HanoiTest {

    @Test
    public void moveOneDisc() {
        Hanoi.move(1,  "A", "B","C");
    }

    @Test
    public void moveTwoDiscs() {
        Hanoi.move(2,  "A", "B","C");
    }

    @Test
    public void moveThreeDiscs() {
        Hanoi.move(3,  "A", "B","C");
    }

    @Test
    public void moveTenDiscs() {
        Hanoi.move(10,  "A", "B","C");
    }
}