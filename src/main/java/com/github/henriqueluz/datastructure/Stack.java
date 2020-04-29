package com.github.henriqueluz.datastructure;

import java.util.ArrayList;
import java.util.List;

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
        top--;
        return elements.get(top);
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
        elements.remove(top);
        return element;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = top - 1; i >= 0; i--) {
            result += elements.get(i) + ", ";
        }

        return result;
    }

}
