package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public enum Operation {

    Addition( (x, y) -> x + y),
    Subtraction( (x, y) -> x - y),
    Multiplication( (x, y) -> x * y),
    Division( (x, y) -> x / y);

    private BinaryOperator<Integer> operation;

    Operation(BinaryOperator<Integer> operation) {
        this.operation = operation;
    }

    public Integer execute(Integer first, Integer second) {
        return this.operation.apply(first, second);
    }

}
