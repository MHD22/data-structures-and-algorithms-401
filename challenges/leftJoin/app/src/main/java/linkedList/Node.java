package linkedList;

public class  Node <T> {
      public  String key;
      public  T value;
      public  Node next;

        public Node(String key, T value){
            this.value = value;
            this.key = key;
        }
}
