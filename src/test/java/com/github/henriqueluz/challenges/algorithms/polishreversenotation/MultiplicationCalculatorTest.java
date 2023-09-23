package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationCalculatorTest {

    @Test
    public void applyMultiplicationOperation() {
        Operation multiplication = Operation.Multiplication;
        assertThat(multiplication.execute(5, 5)).isEqualTo(25);
    }
    
}
