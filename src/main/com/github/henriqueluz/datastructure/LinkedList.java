package com.github.henriqueluz.datastructure;

public class LinkedList<T> {

    private Node head;

    private class Node {
        T value;
        Node next;
    }

    public void add(T element) {
        if (head == null) {
            head = new Node();
            head.value = element;
        } else {
            Node current = head;
            while (current != null) {
                if(current.next == null) {
                    current.next = new Node();
                    current.next.value = element;
                    return;
                }
                current = current.next;
            }
        }
    }

    public boolean contains(T element) {
        Node current = head;

        while (current != null) {
            if (current.value.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(T element) {

    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";

        while (current != null) {
            result += current.value + ",";
            current = current.next;
        }

        return result;
    }
}
