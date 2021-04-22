package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
    Node root=null;
    int nodes = 0;



    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }
    
    public void add(T value){
        nodes++;
        Node newNode = new Node(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            Node currentNode = queue.poll();

            if(currentNode.left == null){
                currentNode.left = newNode;
                return;
            }
            if(currentNode.right == null){
                currentNode.right = newNode;
                return;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);

        }
    }


    public List<T> preOrder(Node root){
        List <T> tree = new ArrayList<>();
        if(!isEmpty()){
            tree.add((T) root.value);
            if(root.left != null)
                tree.addAll(preOrder(root.left));
            if(root.right != null)
                tree.addAll(preOrder(root.right));
        }
        return tree;
    }
    public List<T> inOrder(Node root){
        List <T> tree = new ArrayList<>();
        if(!isEmpty()){

            if(root.left != null)
                tree.addAll(inOrder(root.left));

            tree.add((T) root.value);

            if(root.right != null)
                tree.addAll(inOrder(root.right));
        }
        return tree;
    }
    public List<T> postOrder(Node root){
        List <T> tree = new ArrayList<>();

        if(!isEmpty()){

            if(root.left != null)
                tree.addAll(postOrder(root.left));

            if(root.right != null)
                tree.addAll(postOrder(root.right));

            tree.add((T) root.value);
        }
        return tree;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "\n root=" + root +
                "\nnodes=" + nodes +
                '}';
    }
}
