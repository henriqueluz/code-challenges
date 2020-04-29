package com.github.henriqueluz.datastructure.tree;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PreOrderTraverse implements Traversable {

    @Override
    public String traverse(BinaryTree.Node node) {
        if (node != null) {
            return Stream.of(node.getData().toString(),
                             traverse(node.getLeft()),
                             traverse(node.getRight()))
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.joining(","));
        }

        return "";
    }

    @Override
    public boolean check(String traversal) {
        return PRE_ORDER.equals(traversal);
    }
}
