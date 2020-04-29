package com.github.henriqueluz.datastructure;

import org.junit.Assert;
import org.junit.Test;

import static com.github.henriqueluz.datastructure.BinaryTree.IN_ORDER;
import static com.github.henriqueluz.datastructure.BinaryTree.POST_ORDER;
import static com.github.henriqueluz.datastructure.BinaryTree.PRE_ORDER;

public class BinaryTreeTest {

    @Test
    public void shouldCreateNewTreeWithRoot() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        Assert.assertTrue(tree.contains(1));
        Assert.assertFalse(tree.contains(2));

        tree.add(2);
        Assert.assertTrue(tree.contains(1));
        Assert.assertTrue(tree.contains(2));
    }

    @Test
    public void shouldTraverseBinaryTreeInPostOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        Assert.assertEquals("2,3,1,", tree.traverse(POST_ORDER));
    }

    @Test
    public void shouldTraverseBinaryTreeInPreOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        Assert.assertEquals("1,2,3,", tree.traverse(PRE_ORDER));
    }

    @Test
    public void shouldTraverseBinaryTreeInInOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        Assert.assertEquals("2,1,3,", tree.traverse(IN_ORDER));
    }

    @Test
    public void shouldReturnTreeHeight() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        Assert.assertEquals(3, tree.height());
    }

}