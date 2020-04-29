package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationCalculatorTest {

    @Test
    public void shouldCheckMultiplicationOperatorIsTrue() {
        MultiplicationCalculator calculator = new MultiplicationCalculator();
        assertThat(calculator.check("*")).isTrue();
    }

    @Test
    public void shouldCheckAnyOtherOperatorIsFalse() {
        MultiplicationCalculator calculator = new MultiplicationCalculator();
        assertThat(calculator.check("+")).isFalse();
        assertThat(calculator.check("-")).isFalse();
        assertThat(calculator.check("/")).isFalse();
    }

    @Test
    public void applyMultiplicationOperation() {
        MultiplicationCalculator calculator = new MultiplicationCalculator();
        assertThat(calculator.apply(5, 5)).isEqualTo(25);
    }
    
}
