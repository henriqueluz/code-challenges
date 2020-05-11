package com.github.henriqueluz.datastructure.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    @Test
    public void shouldCreateNewTreeWithRoot() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        assertTrue(tree.contains(1));
        assertFalse(tree.contains(2));

        tree.add(2);
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(2));
    }

    @Test
    public void shouldTraverseBinaryTreeInPostOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        assertEquals("2,3,1", tree.postOrder());
    }

    @Test
    public void shouldTraverseBinaryTreeInPreOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        assertEquals("1,2,3", tree.preOrder());
    }

    @Test
    public void shouldTraverseBinaryTreeInInOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        assertEquals("2,1,3", tree.inOrder());
    }

    @Test
    public void shouldReturnTreeHeight() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        assertThat(tree.height()).isEqualTo(3);
    }

}