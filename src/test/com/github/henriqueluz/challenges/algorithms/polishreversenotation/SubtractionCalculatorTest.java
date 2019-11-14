package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtractionCalculatorTest {

    @Test
    public void shouldCheckSubtractionOperatorIsTrue() {
        SubtractionCalculator calculator = new SubtractionCalculator();
        assertThat(calculator.check("-")).isTrue();
    }

    @Test
    public void shouldCheckAnyOtherOperatorIsFalse() {
        SubtractionCalculator calculator = new SubtractionCalculator();
        assertThat(calculator.check("+")).isFalse();
        assertThat(calculator.check("*")).isFalse();
        assertThat(calculator.check("/")).isFalse();
    }

    @Test
    public void applySubtractionOperation() {
        SubtractionCalculator calculator = new SubtractionCalculator();
        assertThat(calculator.apply(10, 5)).isEqualTo(5);
    }

}
