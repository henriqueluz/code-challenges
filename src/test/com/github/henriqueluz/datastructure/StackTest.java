package com.github.henriqueluz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void shouldPushElementsToStack() {
        Stack<Integer> stack = new Stack<>(5);
        Assert.assertTrue(stack.isEmpty());

        stack.push(10);
        stack.push(20);

        Assert.assertFalse(stack.isEmpty());

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
        Integer value = stack.pop();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(expected, value);
    }

    @Test
    public void shouldPeekElementFromStack() {
        Stack<Integer> stack = new Stack<>(10);
        Integer expected = 10;
        stack.push(10);
        Integer value = stack.peek();

        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(expected, value);
    }

}