package tree;

public class BinarySearchTree<T> extends BinaryTree {

    @Override
    public void add(Object value) {
        nodes++;
        value = (T) value;
        Node newNode = new Node(value);
        if(isNotEmpty()){
            Node current = root;
            try{
                while(current != null){
                    if(  (int) value <= (int) current.value  ){
                        if(current.left == null){
                            current.left = newNode;
                            return;
                        }
                        current = current.left;
                    }
                    else{
                        if(current.right == null){
                            current.right = newNode;
                            return;
                        }
                        current = current.right;
                    }
                }
            }
            catch (ClassCastException e){
                System.out.println("error.. search tree must be on Integers values only\n"+e.getMessage());
                nodes--;
                return;
            }
        }
        root = newNode;
    }

    public boolean contains(T value){
        value = (T) value;
        if(isNotEmpty()){
            Node current = root;
            try{
                while(current != null){
                    if((int) value == (int) current.value)
                        return true;
                    if(  (int) value < (int) current.value  ){
                        if(current.left == null){
                            return false;
                        }
                        current = current.left;
                    }
                    else{
                        if(current.right == null){
                            return false;
                        }
                        current = current.right;
                    }
                }
            }
            catch (ClassCastException e){
                System.out.println("error.. search tree must be on Integers values only\n"+e.getMessage());
                nodes--;
                return false;
            }
        }
        return false;
    }
}
