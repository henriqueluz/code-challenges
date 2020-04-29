package com.github.henriqueluz.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stack<T> {

    private List<T> elements;
    private int top;
    private int max;

    public Stack(int size) {
        elements = new ArrayList<>(size);
        max = size;
        top = 0;
    }

    public T peek() {
        if (top == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements.get(top - 1);
    }

    public void push(T value) {
        if(top == max) {
            throw new IllegalStateException("Stack has reached the limit");
        }

        elements.add(top, value);
        top++;
    }

    public T pop() {
        T element = peek();
        top--;
        elements.remove(top);
        return element;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public String toString() {
       return Stream.of(elements)
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }

}
