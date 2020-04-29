package com.github.henriqueluz.datastructure.tree;

import java.util.Arrays;
import java.util.List;

import static com.github.henriqueluz.datastructure.tree.Traversable.*;
import static java.lang.Math.max;

public class BinaryTree {

    private Node root;

    public BinaryTree(Integer value) {
        this.root = new Node(value);
    }

    protected class Node {
        private Node left;
        private Node right;
        private Integer data;
        private List<Traversable> traversables = Arrays.asList(new PreOrderTraverse(),
                                                                new PostOrderTraverse(),
                                                                new InOrderTraverse());

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

        String traverse(String traversal) {
            return traversables.stream()
                                .filter(t -> t.check(traversal))
                                .findFirst().orElse(new PreOrderTraverse())
                                .traverse(this);
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

    public String preOrder() {
        return root.traverse(PRE_ORDER);
    }

    public String postOrder() {
        return root.traverse(POST_ORDER);
    }

    public String inOrder() {
        return root.traverse(IN_ORDER);
    }
}
