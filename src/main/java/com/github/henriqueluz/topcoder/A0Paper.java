package com.github.henriqueluz.topcoder;

public class A0Paper {


    public static String canBuild(int[] stock) {
        int stockSum = 0;
        int size = stock.length;

        for (int i = 0; i < size; i++) {
            if (((stockSum * 2) + stock[i]) >= Math.pow(2, i)) {
                return "Possible";
            }
            stockSum += stock[i];
        }
        return "Impossible";
    }

}
