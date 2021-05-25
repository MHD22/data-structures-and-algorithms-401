package hashtable;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class Hashtable<T> {
    private LinkedList<T>[] buckets = new LinkedList[100];
    private final int prime = 599;
    private int size = 0;

    public Hashtable() {
        for (int i =0 ; i < buckets.length ; i++)
            buckets[i] = new LinkedList<T>();
    }

    public void add(String key, T value){
        int index = hash(key);
        LinkedList<T> currentLL = buckets[index];
        Node keyNode = currentLL.getNode(key);
        if( keyNode == null ){
            currentLL.append(key,value);
            this.size++;
        }
        else{
            keyNode.value = value;
        }
    }

    private int hash(String key){
        int sum = 0;
        int index = 0;
        for(int i = 0 ; i < key.length() ; i++ ){
            char currentChar = key.charAt(i);
            int ascii = currentChar;
            sum += ascii;
        }
        int sizeOfBuckets = buckets.length;
        index = (sum * prime) % (sizeOfBuckets -1) ;
        return index;
    }

    public T get(String key){
        int index = hash(key);
        LinkedList<T> currentLL = buckets[index];
        Node keyNode = currentLL.getNode(key);
        if( keyNode == null ){
           return null;
        }
        else{
           return (T) keyNode.value;
        }
    }

    public int size(){
        return this.size;
    }

    public List<List<String>> getEntries(){

        List<List<String>> entries = new ArrayList<>();

        for(LinkedList ll : buckets){
            if( isThereDataInTheCurrentBucket(ll) ){
                Node currentNode = ll.head;
                while(currentNode != null){
                    List<String> entry = new ArrayList<>();
                    entry.add(currentNode.key);
                    entry.add(currentNode.value.toString());
                    entries.add(entry);
                    currentNode = currentNode.next;
                }
            }
        }
        return entries;
    }

    public List<List<String>> leftJoin(Hashtable hash2){
        List<List<String>> entries = this.getEntries();

        for( List<String> entry : entries){
            String key = entry.get(0);
            if(hash2.contains(key))
                entry.add(hash2.get(key).toString());
            else
                entry.add(null);
        }
        return entries;
    }

    private boolean isThereDataInTheCurrentBucket(LinkedList ll){
        return ! ll.isListEmpty();

    }

    public boolean contains(String key){
        int index = hash(key);
        LinkedList<T> currentLL = buckets[index];
        Node keyNode = currentLL.getNode(key);
        if( keyNode == null ){
            return false;
        }
        else{
            return true;
        }
    }


    @Override
    public String toString() {
        if(this.size ==0)
            return "Null";

        StringBuilder out = new StringBuilder();
        for (int i = 0 ; i < buckets.length; i++) {
            if (buckets[i].isListEmpty())
                continue;
            out.append(i);
            out.append(" : [ ");
            out.append(buckets[i].toString());
            out.append(" ]\n");
        }

        return out.toString();
    }

}
