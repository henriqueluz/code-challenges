package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;

public class PolishReverseNotationEvaluator implements ExpressionEvaluator {

    private Deque<Integer> resultStack = new ArrayDeque<>();
    private final List<SentenceCalculator> calculators = asList(
            new AdditionCalculator(),
            new MultiplicationCalculator(),
            new DivisionCalculator(),
            new SubtractionCalculator()
    );

    @Override
    public Integer evaluate(String expression) {
        String[] characters = expression.split(" ");

        Stream.of(characters).forEach(token -> {

            if (isOperator(token)) {
                Integer operand1 = resultStack.pop();
                Integer operand2 = resultStack.pop();
                Integer result = calculate(token, operand2, operand1);
                resultStack.push(result);
            } else {
                resultStack.push(parseInt(token));
            }

        });

        return resultStack.pop();
    }

    private boolean isOperator(String character) {
        return calculators.stream().anyMatch(c -> c.check(character));
    }

    private Integer calculate(String operator, Integer operand1, Integer operand2) {
        return calculators.stream()
                .filter(calculator -> calculator.check(operator))
                .findFirst()
                .map(calculator -> calculator.apply(operand1, operand2))
                .orElse(0);
    }

}
