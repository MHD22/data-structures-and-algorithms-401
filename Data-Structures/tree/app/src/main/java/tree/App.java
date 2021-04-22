/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {


        BinaryTree<Integer> tree = new BinaryTree<>();
        BinarySearchTree<Integer> tr = new BinarySearchTree<>();
        System.out.println(tree);
        tree.add(5);
        tree.add(6);
        tree.add(4);

//        System.out.println(tree.preOrder(tree.root));
//        System.out.println(tree.inOrder(tree.root));
//        System.out.println(tree.postOrder(tree.root));

        tr.add(10);
        tr.add(5);
        tr.add(7);
        tr.add(8);
        tr.add(15);
        System.out.println(tr);
        System.out.println(tr.contains(5));
        System.out.println(tr.preOrder(tr.root));
        System.out.println(tr.inOrder(tr.root));
        System.out.println(tr.postOrder(tr.root));
    }
}
