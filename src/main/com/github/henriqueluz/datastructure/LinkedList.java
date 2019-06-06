package com.github.henriqueluz.datastructure;

public class LinkedList<T> {

    private Node head;

    private class Node {
        T value;
        Node next;

        Node(T data) {
            value = data;
        }
    }

    public void add(T element) {
        if (head == null) {
            head = new Node(element);
        } else {
            Node current = head;
            while (current != null) {
                if(current.next == null) {
                    current.next = new Node(element);
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
        Node current = head;
        Node previous = current;

        if (current != null && current.value.equals(element)) {
            head = current.next;
            return;
        }

        while(current != null) {
            if (current.value.equals(element)) {
                previous.next = current.next;
                current = null;
                return;
            }

            previous = current;
            current = current.next;
        }

        return;
    }

    public boolean isEmpty() {
        return head == null;
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
