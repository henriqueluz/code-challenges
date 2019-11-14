package com.github.henriqueluz.challenges.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

public class PolishReverseNotationCalculator {

    private static Deque<Integer> expression = new ArrayDeque<>();

    public static Integer apply(String sentence) {
        String[] characters = sentence.split(" ");

        for (int i = 0; i < characters.length; i++) {
            String character = characters[i];
            if (isOperator(character)) {
                Integer operand1 = expression.pop();
                Integer operand2 = expression.pop();
                Integer result = calculate(character, operand1, operand2);
                expression.push(result);
            } else {
                expression.push(parseInt(character));
            }
        }

        return expression.pop();
    }

    private static boolean isOperator(String character) {
        return "+ - * \\".contains(character);
    }

    private static Integer calculate(String operator, Integer operand1, Integer operand2) {
        switch (operator) {
            case "+" :
                return operand1 + operand2;
            case "-" :
                return operand1 - operand2;
            case "*" :
                return operand1 * operand2;
            case "/" :
                return operand1 / operand2;
            default :
                return operand1 + operand2;
        }
    }

}
