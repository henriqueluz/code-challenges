package com.github.henriqueluz.datastructure;

public class BinaryTree<T> {

    private Node root;

    public BinaryTree(T value) {
        this.root = new Node(value);
    }

    private class Node {
        Node left;
        Node right;
        T value;

        Node(T value) {
            this.value = value;
        }
    }

    public String postOrder() {
        return postOrder(root);
    }

    private String postOrder(Node node) {
        String result = "";
        if (node != null) {
            result += postOrder(node.left);
            result += postOrder(node.right);
            result += node.value.toString() + ",";
        }
        return result;
    }

    public String preOrder() {
        return preOrder(root);
    }

    private String preOrder(Node node) {
        String result = "";
        if (node != null) {
            result += node.value.toString() + ",";
            result += preOrder(node.left);
            result += preOrder(node.right);
        }
        return result;
    }

    public String inOrder() {
        return inOrder(root);
    }

    private String inOrder(Node node) {
        String result = "";
        if (node != null) {
            result += inOrder(node.left);
            result += node.value.toString() + ",";
            result += inOrder(node.right);
        }
        return result;
    }

    public void add(T value) {
        add(root, value);

    }

    private void add(Node node, T value) {
        if (node.left == null) {
            node.left = new Node(value);
        } else if (node.right == null) {
            node.right = new Node(value);
        } else {
            add(node.left, value);
        }
    }

}
