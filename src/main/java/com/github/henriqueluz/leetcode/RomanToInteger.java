package com.github.henriqueluz.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RomanToInteger {

    private static Map<String, Integer> romanToInt;
    private static Map<String, Integer> subtractive;

    static {
        romanToInt = new HashMap<>();
        subtractive = new HashMap<>();
        romanToInt.put("I", 1);
        romanToInt.put("V", 5);
        romanToInt.put("X", 10);
        romanToInt.put("L", 50);
        romanToInt.put("C", 100);
        romanToInt.put("D", 500);
        romanToInt.put("M", 1000);
        subtractive.put("IV", 2);
        subtractive.put("IX", 2);
        subtractive.put("XL", 20);
        subtractive.put("XC", 20);
        subtractive.put("CD", 200);
        subtractive.put("CM", 200);
    }

    public static int parse(String roman) {
        Integer grossValue = Stream.of(roman.split(""))
                .mapToInt(RomanToInteger::lookup)
                .sum();

        Integer excess = subtractive.entrySet().stream()
                .filter(e -> roman.contains(e.getKey()))
                .mapToInt(Map.Entry::getValue)
                .sum();

        return grossValue - excess;
    }

    public static int parseFast(String roman) {
        String[] values = roman.split("");
        int sum = 0;
        int size = values.length;

        for (int i = 0; i < size - 1; i++) {
            Integer actual = lookup(values[i]);
            Integer next = lookup(values[i+1]);
            if (actual < next) sum -= actual;
            else sum += actual;
        }

        return sum + lookup(values[size - 1]);
    }

    private static Integer lookup(String value) {
        return romanToInt.getOrDefault(value, 0);
    }

}
