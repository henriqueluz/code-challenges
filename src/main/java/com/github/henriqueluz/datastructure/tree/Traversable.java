package com.github.henriqueluz.datastructure.tree;

public interface Traversable {
    String POST_ORDER = "PostOrder";
    String PRE_ORDER = "PreOrder";
    String IN_ORDER = "InOrder";

    <T extends Comparable<T>, E extends Comparable<E>> String traverse(BinaryTree<T>.Node<E> node);
    boolean check(String traversal);

}
