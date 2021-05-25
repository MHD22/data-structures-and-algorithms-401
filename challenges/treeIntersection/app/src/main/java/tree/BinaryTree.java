package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
    public Node root=null;
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

    public List<T> breadthFirstSearch(){
        List <T> tree = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(isNotEmpty()){
            queue.add(root);
            while(!queue.isEmpty()){

                Node currentNode = queue.poll();
                tree.add((T)currentNode.value);

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
        return tree;
    }


    public int findMaximumValue(Node root){
        if(this.isNotEmpty()){
            int max =(int) root.value;
            int left = max;
            int right = max;

            if(root.left == null && root.right == null)
                return (int) root.value;

            if(root.left != null)
                left = findMaximumValue(root.left);
            if(root.right != null)
                right = findMaximumValue(root.right);

            if( left > max)
                max = left;
            if(right > max)
                max = right;
            return max;
        }
        return -1;
    }

    public  int findFilesInDirectory(Node root){
        int sum =0;
        if(root.left == null && root.right == null)
            return 1;
        if(root.left != null)
            sum += findFilesInDirectory(root.left);
        if(root.right != null)
            sum += findFilesInDirectory(root.right);

        return sum;
    }
    public  boolean compareFilesInTwoDirectories(BinaryTree<T> tree1,BinaryTree<T> tree2 ){
        int filesInTree1 = findFilesInDirectory(tree1.root);
        int filesInTree2 = findFilesInDirectory(tree2.root);
        return filesInTree1 == filesInTree2;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "\n root=" + root +
                "\nnodes=" + nodes +
                '}';
    }
}
