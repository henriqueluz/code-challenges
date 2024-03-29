package com.github.henriqueluz.challenges.algorithms.polishreversenotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionOperationTest {

    @Test
    public void applyAdditionOperation() {
        Operation addition = Operation.Addition;
        assertThat(addition.execute(4, 5)).isEqualTo(9);
    }

}
