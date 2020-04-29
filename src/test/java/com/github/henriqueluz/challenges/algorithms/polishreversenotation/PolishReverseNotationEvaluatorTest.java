package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolishReverseNotationEvaluatorTest {

    @Test
    public void evaluateASingleExpressionInPolishReverseNotation() {
        String expression = "3";
        Integer expected = 3;
        assertThat(new PolishReverseNotationEvaluator().evaluate(expression)).isEqualTo(expected);
    }

    @Test
    public void evaluateASimpleOperationInPolishReverseNotation() {
        String expression = "3 2 *";
        Integer expected = 6;
        assertThat(new PolishReverseNotationEvaluator().evaluate(expression)).isEqualTo(expected);
    }

    @Test
    public void evaluateAComplexExpressionInPolishReverseNotation() {
        String expression = "15 7 1 1 + - / 3 * 2 1 1 + + -";
        Integer expected = 5;
        assertThat(new PolishReverseNotationEvaluator().evaluate(expression)).isEqualTo(expected);
    }

}