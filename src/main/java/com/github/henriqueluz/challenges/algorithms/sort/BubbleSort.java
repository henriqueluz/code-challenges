package com.github.henriqueluz.challenges.algorithms.sort;

import java.util.List;

public class BubbleSort implements Sortable {

    @Override
    public List<Integer> sort(List<Integer> unsorted) {
        for (int i = 0; i < unsorted.size(); i++) {
            for (int j = i; j < unsorted.size(); j++) {
                if (unsorted.get(j) < unsorted.get(i)) {
                    int swap = unsorted.get(i);
                    unsorted.set(i, unsorted.get(j));
                    unsorted.set(j, swap);
                }
            }
        }
        return unsorted;
    }
}
