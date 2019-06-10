package com.github.henriqueluz.challenges;

import com.github.henriqueluz.datastructure.Stack;

import static java.lang.Integer.parseInt;

public class PRN {

    private static Stack<Integer> stack = new Stack<>(200);

    public static Integer calc(String sentence) {
        String[] characters = sentence.split(" ");

        for (int i = 0; i < characters.length; i++) {
            String character = characters[i];
            if (isOperator(character)) {
                Integer operand1 = stack.pop();
                Integer operand2 = stack.pop();
                Integer result = calculate(character, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(parseInt(character));
            }
        }

        return stack.pop();
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
