package com.github.henriqueluz.challenges.algorithms.recursion;

public class Hanoi {

    public static void move(Integer numberOfDiscs, String from, String intermediate, String to) {
        String message = String.format("Moving disc #%s from [%s] to [%s]", numberOfDiscs, from, to);
        if (numberOfDiscs.equals(1)) {
            System.out.println(message);
        } else {
            move(numberOfDiscs - 1, from, to, intermediate);
            System.out.println(message);
            move(numberOfDiscs - 1, intermediate, from, to);
        }
    }

}
