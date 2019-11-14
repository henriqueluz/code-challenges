package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import com.github.henriqueluz.challenges.algorithms.polishreversenotation.AdditionCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionCalculatorTest {

    @Test
    public void shouldCheckAdditionOperatorIsTrue() {
        AdditionCalculator calculator = new AdditionCalculator();
        assertThat(calculator.check("+")).isTrue();
    }

    @Test
    public void shouldCheckAnyOtherOperatorIsFalse() {
        AdditionCalculator calculator = new AdditionCalculator();
        assertThat(calculator.check("-")).isFalse();
        assertThat(calculator.check("*")).isFalse();
        assertThat(calculator.check("/")).isFalse();
    }

    @Test
    public void applyAdditionOperation() {
        AdditionCalculator calculator = new AdditionCalculator();
        assertThat(calculator.apply(4, 5)).isEqualTo(9);
    }

}
