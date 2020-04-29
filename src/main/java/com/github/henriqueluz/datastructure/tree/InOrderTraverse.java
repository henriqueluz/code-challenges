package com.github.henriqueluz.datastructure.tree;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InOrderTraverse implements Traversable {

    @Override
    public String traverse(BinaryTree.Node node) {
            if (node != null) {
                return Stream.of(traverse(node.getLeft()), node.getData().toString(), traverse(node.getRight()))
                            .filter(s -> !s.isEmpty())
                            .collect(Collectors.joining(","));
            }

            return "";
        }
}
