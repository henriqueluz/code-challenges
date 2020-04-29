package com.github.henriqueluz.datastructure.tree;

import static java.lang.Math.max;

public class BinaryTree {

    public static final String POST_ORDER = "PostOrder";
    public static final String PRE_ORDER = "PreOrder";
    public static final String IN_ORDER = "InOrder";

    private Node root;

    public BinaryTree(Integer value) {
        this.root = new Node(value);
    }

    protected class Node {
        private Node left;
        private Node right;
        private Integer data;

        Node(Integer value) {
            this.data = value;
        }

        boolean contains(Integer value) {
            if (this.data.equals(value)) {
                return true;
            } else if (left != null) {
                return left.contains(value);
            } else if (right != null) {
                return right.contains(value);
            }
            return false;
        }

        Integer height() {
            if (left == null && right == null) {
                return 1;
            } else if (left != null && right != null) {
                return 1 + max(left.height(), right.height());
            } else if (right == null) {
                return left.height();
            } else {
                return right.height();
            }
        }

        void add(Integer data) {
            if (left == null) {
                left = new Node(data);
            } else if (right == null) {
                right = new Node(data);
            } else {
                left.add(data);
            }
        }
    }

    public boolean contains(Integer value) {
        return root.contains(value);
    }


    public Integer height() {
        return root.height();
    }

    public void add(Integer value) {
        root.add(value);
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
                  .append(node.data.toString())
                  .append(",");
        }
        return result.toString();
    }

    private String preOrder(Node node) {
        StringBuilder result = new StringBuilder();
        if (node != null) {
            result.append(node.data.toString())
                    .append(",")
                    .append(preOrder(node.left))
                    .append(preOrder(node.right));
        }
        return result.toString();
    }

    private String inOrder(Node node) {
        StringBuilder result = new StringBuilder();
        if (node != null) {
            result.append(inOrder(node.left))
                    .append(node.data.toString())
                    .append(",")
                    .append(inOrder(node.right));
        }
        return result.toString();
    }

}
