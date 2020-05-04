package com.github.henriqueluz.challenges.algorithms.sort;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortTest {

    private InsertionSort insertionSort = new InsertionSort();

    @Test
    public void sortEmptyArray() {
        assertThat(insertionSort.sort(emptyList())).containsExactly();
    }

    @Test
    public void sortArrayWithSingleElement() {
        assertThat(insertionSort.sort(singletonList(1))).containsExactly(1);
    }

    @Test
    public void sortArrayWithTwoElementsUnordered() {
        assertThat(insertionSort.sort(asList(2, 1))).containsExactly(1, 2);
    }

    @Test
    public void sortArrayWithTwoElementsOrdered() {
        assertThat(insertionSort.sort(asList(2, 1))).containsExactly(1, 2);
    }

    @Test
    public void sortArrayWithManyElementsUnordered() {
        assertThat(insertionSort.sort(asList(4, 5, 3, 7, 2, 10, 1, 6, 9, 8))).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    public void sortArrayWithManyElementsOrdered() {
        assertThat(insertionSort.sort(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}