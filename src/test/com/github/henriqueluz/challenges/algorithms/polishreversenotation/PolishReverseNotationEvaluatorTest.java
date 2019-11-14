package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import com.github.henriqueluz.challenges.algorithms.polishreversenotation.PolishReverseNotationEvaluator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolishReverseNotationEvaluatorTest {

    @Test
    public void evaluateAGivenExpressionInPolishReverseNotation() {
        String expression = "3 2 *";
        Integer expected = 6;
        assertThat(new PolishReverseNotationEvaluator().evaluate(expression)).isEqualTo(expected);
    }

}