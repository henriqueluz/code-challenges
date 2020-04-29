package com.github.henriqueluz.datastructure;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldPushElementsToStack() {
        Stack<Integer> stack = new Stack<>(5);
        assertTrue(stack.isEmpty());

        stack.push(10);
        stack.push(20);

        assertFalse(stack.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenReachLimit() {
        Stack<Integer> stack = new Stack<>(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenPopEmptyStack() {
        Stack<Integer> stack = new Stack<>(10);

        stack.pop();
    }

    @Test
    public void shouldPopElementFromStack() {
        Stack<Integer> stack = new Stack<>(10);
        Integer expected = 10;
        stack.push(10);
        stack.push(20);
        Integer first = stack.pop();
        Integer second = stack.pop();

        assertTrue(stack.isEmpty());
        assertEquals(expected, second);
        assertThat(second).isNotEqualTo(first);
    }

    @Test
    public void shouldPeekElementFromStack() {
        Stack<Integer> stack = new Stack<>(10);
        Integer expected = 10;
        stack.push(10);
        Integer first = stack.peek();
        Integer second = stack.peek();

        assertFalse(stack.isEmpty());
        assertEquals(expected, first);
        assertEquals(second, first);
    }

    @Test
    public void shouldConvertToString() {
        Stack<Integer> stack = new Stack<>(10);
        Integer expected = 10;
        stack.push(10);
        stack.push(20);
        stack.push(30);
        Integer first = stack.peek();
        Integer second = stack.peek();

        assertThat(stack.toString()).isEqualTo("[10, 20, 30]");
    }

}