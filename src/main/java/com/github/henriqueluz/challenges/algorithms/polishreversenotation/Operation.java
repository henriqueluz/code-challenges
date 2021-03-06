package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public enum Operation {

    Addition( (x, y) -> x + y, "+"::equals),
    Subtraction( (x, y) -> x - y, "-"::equals),
    Multiplication( (x, y) -> x * y, "*"::equals),
    Division( (x, y) -> x / y, "/"::equals);

    private BinaryOperator<Integer> operation;
    private Predicate<String> operator;

    Operation(BinaryOperator<Integer> operation, Predicate<String> operator) {
        this.operation = operation;
        this.operator = operator;
    }

    public Integer execute(Integer first, Integer second) {
        return this.operation.apply(first, second);
    }

    public boolean check(String operator) {
        return this.operator.test(operator);
    }

}
