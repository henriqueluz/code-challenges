package com.github.henriqueluz.datastructure.tree;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PostOrderTraverse implements Traversable {

    @Override
    public String traverse(BinaryTree.Node node) {
        if (node != null) {
            return Stream.of(traverse(node.getLeft()),
                                      traverse(node.getRight()),
                                      node.getData().toString())
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.joining(","));
        }

        return "";
    }

    @Override
    public boolean check(String traversal) {
        return POST_ORDER.equals(traversal);
    }
}
