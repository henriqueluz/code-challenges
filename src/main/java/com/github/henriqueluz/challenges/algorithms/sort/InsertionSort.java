package com.github.henriqueluz.challenges.algorithms.sort;

import java.util.List;

public class InsertionSort implements Sortable {

    @Override
    public List<Integer> sort(List<Integer> unsorted) {
        for (int i = 1; i < unsorted.size(); i++) {
            int chosen = unsorted.get(i);
            int j = i - 1;
            while (j >= 0 && chosen < unsorted.get(j)) {
                int actual = unsorted.get(j);
                unsorted.set(j + 1, actual);
                j--;
            }
            unsorted.set(j + 1, chosen);
        }
        return unsorted;
    }
}
