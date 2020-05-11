package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import java.util.function.BiFunction;
import java.util.function.Function;

public enum Operation {

    Addition( (x, y) -> x + y, "+"::equals),
    Subtraction( (x, y) -> x - y, "-"::equals),
    Multiplication( (x, y) -> x * y, "*"::equals),
    Division( (x, y) -> x / y, "/"::equals);

    private BiFunction<Integer, Integer, Integer> operation;
    private Function<String, Boolean> operator;

    Operation(BiFunction<Integer, Integer, Integer> operation, Function<String, Boolean> operator) {
        this.operation = operation;
        this.operator = operator;
    }

    public Integer execute(Integer first, Integer second) {
        return this.operation.apply(first, second);
    }

    public boolean check(String operator) {
        return this.operator.apply(operator);
    }

}
