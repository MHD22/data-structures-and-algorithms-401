package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testCreateAnEmptyTree(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        assertNotNull(tree);
    }

    @Test
    public void testCreateATreeWithSingleRootNode(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(10);
        String expected="[10]";
        String actual = tree.inOrder(tree.root).toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testAddLeftAndRightChildrenToRootNode(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(8);

        String expected="[5, 10, 8]";
        String actual = tree.inOrder(tree.root).toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testReturnCollectionFromPreOrderTraversal(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(8);
        List<Integer> expected=tree.preOrder(tree.root);
        assertArrayEquals(Arrays.asList(10,5,8).toArray(), expected.toArray());
    }

    @Test
    public void testReturnCollectionFromInOrderTraversal(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(8);
        List<Integer> expected=tree.inOrder(tree.root);
        assertArrayEquals(Arrays.asList(5,10,8).toArray(), expected.toArray());
    }

    @Test
    public void testReturnCollectionFromPostOrderTraversal(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(8);
        List<Integer> expected=tree.postOrder(tree.root);
        assertArrayEquals(Arrays.asList(5,8,10).toArray(), expected.toArray());
    }

    // test findMaximumValue:

    @Test
    public void testFindMaximumValueMethod(){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(22);
        tree.add(8);
        assertEquals(22, tree.findMaximumValue(tree.root));
    }
    @Test
    public void testFindMaximumValueMethodIfTheTreeIsEmpty(){
        BinaryTree<Integer> tree = new BinaryTree<>();

        assertEquals(-1, tree.findMaximumValue(tree.root));
    }



}
