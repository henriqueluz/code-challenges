package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static com.github.henriqueluz.challenges.algorithms.polishreversenotation.Operation.Addition;
import static com.github.henriqueluz.challenges.algorithms.polishreversenotation.Operation.Division;
import static com.github.henriqueluz.challenges.algorithms.polishreversenotation.Operation.Multiplication;
import static com.github.henriqueluz.challenges.algorithms.polishreversenotation.Operation.Subtraction;
import static java.lang.Integer.parseInt;

public class PolishReverseNotationEvaluator implements ExpressionEvaluator {

    private final Deque<Integer> resultStack = new ArrayDeque<>();
    private final Map<String, Operation> operations = Map.of("+", Addition,
            "/", Division,
            "*", Multiplication,
            "-", Subtraction);

    @Override
    public Integer evaluate(String expression) {
        String[] tokens = expression.split(" ");
        Stream.of(tokens).forEach(processToken());
        return resultStack.pop();
    }

    private Consumer<String> processToken() {
        return token -> {
            if (isOperator(token)) {
                int operand1 = resultStack.pop();
                int operand2 = resultStack.pop();
                Integer result = calculate(token, operand2, operand1);
                resultStack.push(result);
            } else {
                resultStack.push(parseInt(token));
            }
        };
    }

    private boolean isOperator(String character) {
        return operations.containsKey(character);
    }

    private Integer calculate(String operator, int operand1, int operand2) {
        return operations.get(operator).execute(operand1, operand2);
    }

}
