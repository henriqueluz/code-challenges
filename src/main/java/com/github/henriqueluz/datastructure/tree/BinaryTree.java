package com.github.henriqueluz.datastructure.tree;

import static java.lang.Math.max;

public class BinaryTree {

    public static final String POST_ORDER = "PostOrder";
    public static final String PRE_ORDER = "PreOrder";
    public static final String IN_ORDER = "InOrder";
    private final Traversable preOrder = new PreOrderTraverse();
    private final Traversable postOrder = new PostOrderTraverse();
    private final Traversable inOrder = new InOrderTraverse();

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

        public Integer getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
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
                return postOrder.traverse(root);
            case IN_ORDER :
                return inOrder.traverse(root);
            default :
                return preOrder.traverse(root);
        }
    }

}
