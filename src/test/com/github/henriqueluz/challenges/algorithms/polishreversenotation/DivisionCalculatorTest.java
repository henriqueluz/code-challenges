package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisionCalculatorTest {

    @Test
    public void shouldCheckDivisionOperatorIsTrue() {
        DivisionCalculator calculator = new DivisionCalculator();
        assertThat(calculator.check("/")).isTrue();
    }

    @Test
    public void shouldCheckAnyOtherOperatorIsFalse() {
        DivisionCalculator calculator = new DivisionCalculator();
        assertThat(calculator.check("+")).isFalse();
        assertThat(calculator.check("*")).isFalse();
        assertThat(calculator.check("-")).isFalse();
    }

    @Test
    public void applyDivisionOperation() {
        DivisionCalculator calculator = new DivisionCalculator();
        assertThat(calculator.apply(10, 5)).isEqualTo(2);
    }
    
}
