package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisionCalculatorTest {

    @Test
    public void applyDivisionOperation() {
        Operation division = Operation.Division;
        assertThat(division.execute(10, 5)).isEqualTo(2);
    }
    
}
