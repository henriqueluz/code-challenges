package com.github.henriqueluz.datastructure.tree;

public interface Traversable {
    String POST_ORDER = "PostOrder";
    String PRE_ORDER = "PreOrder";
    String IN_ORDER = "InOrder";

    String traverse(BinaryTree.Node node);
    boolean check(String traversal);

}
