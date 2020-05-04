package com.github.henriqueluz.challenges.algorithms.sort;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void sortEmptyArray() {
        assertThat(bubbleSort.sort(emptyList())).containsExactly();
    }

    @Test
    public void sortArrayWithSingleElement() {
        assertThat(bubbleSort.sort(asList(1))).containsExactly(1);
    }

    @Test
    public void sortArrayWithTwoElementsUnordered() {
        assertThat(bubbleSort.sort(asList(2, 1))).containsExactly(1, 2);
    }

    @Test
    public void sortArrayWithTwoElementsOrdered() {
        assertThat(bubbleSort.sort(asList(2, 1))).containsExactly(1, 2);
    }

    @Test
    public void sortArrayWithManyElementsUnordered() {
        assertThat(bubbleSort.sort(asList(4, 5, 3, 7, 2, 10, 1, 6, 9, 8))).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    public void sortArrayWithManyElementsOrdered() {
        assertThat(bubbleSort.sort(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}