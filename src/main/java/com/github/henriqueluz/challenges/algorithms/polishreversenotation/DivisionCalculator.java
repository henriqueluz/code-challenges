package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

public class DivisionCalculator implements SentenceCalculator {

    @Override
    public Integer apply(Integer firstOperand, Integer secondOperand) {
        return firstOperand / secondOperand;
    }

    @Override
    public boolean check(String character) {
        return "/".equals(character);
    }

}
