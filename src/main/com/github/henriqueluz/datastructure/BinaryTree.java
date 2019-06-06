package com.github.henriqueluz.datastructure;

public class BinaryTree<T> {

    public static final String POST_ORDER = "PostOrder";
    public static final String PRE_ORDER = "PreOrder";
    public static final String IN_ORDER = "InOrder";


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

    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node node, T value) {
        if (node != null) {
            if(node.value.equals(value)) {
                return true;
            } else {
                return contains(node.left, value) || contains(node.left, value);
            }
        }
        return false;
    }

    public String traverse(String traverse) {
        switch (traverse) {
            case POST_ORDER :
                return postOrder(root);
            case PRE_ORDER :
                return preOrder(root);
            case IN_ORDER :
                return inOrder(root);
            default :
                return preOrder(root);
        }
    }

    private String postOrder(Node node) {
        StringBuilder result = new StringBuilder();
        if (node != null) {
            result.append(postOrder(node.left))
                  .append(postOrder(node.right))
                  .append(node.value.toString() + ",");
        }
        return result.toString();
    }

    private String preOrder(Node node) {
        StringBuilder result = new StringBuilder();
        if (node != null) {
            result.append(node.value.toString() + ",")
                    .append(preOrder(node.left))
                    .append(preOrder(node.right));
        }
        return result.toString();
    }

    private String inOrder(Node node) {
        StringBuilder result = new StringBuilder();
        if (node != null) {
            result.append(inOrder(node.left))
                    .append(node.value.toString() + ",")
                    .append(inOrder(node.right));
        }
        return result.toString();
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
