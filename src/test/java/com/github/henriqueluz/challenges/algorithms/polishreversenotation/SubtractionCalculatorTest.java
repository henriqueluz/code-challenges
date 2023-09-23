package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtractionCalculatorTest {

    @Test
    public void applySubtractionOperation() {
        Operation subtraction = Operation.Subtraction;
        assertThat(subtraction.execute(10, 5)).isEqualTo(5);
    }

}
