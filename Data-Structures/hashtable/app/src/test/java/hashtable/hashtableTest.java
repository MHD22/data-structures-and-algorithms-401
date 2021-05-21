package hashtable;

import org.junit.Test;
import static org.junit.Assert.*;
public class hashtableTest {

    @Test public void testHashTableAddingKeyValue() {
        Hashtable<Integer> idsTable = new Hashtable();
        idsTable.add("Mohammad",11);
        boolean output = idsTable.contains("Mohammad");
        assertTrue(output);
    }

    @Test public void testHashTableRetrievingValueBasedOnKey() {
        Hashtable<Integer> idsTable = new Hashtable();
        idsTable.add("Mohammad",11);
        int output = idsTable.get("Mohammad");
        assertEquals(11, output);
    }

    @Test public void testHashTableRetrievingNullForNotExistKey() {
        Hashtable<Integer> idsTable = new Hashtable();
        idsTable.add("Mohamad",11);

        assertEquals(null, idsTable.get("Fadi"));
    }

    @Test public void testHashTableHandleTheCollision() {
        Hashtable<Integer> idsTable = new Hashtable();
        idsTable.add("Mohamad",11);
        idsTable.add("Yaser",22);
        idsTable.add("cdd",33);
        idsTable.add("abc",44);

        String expected =   "6 : [  { Yaser , 22 } --> NULL ]\n" +
                            "10 : [  { Mohamad , 11 } -->  { cdd , 33 } --> NULL ]\n" +
                            "84 : [  { abc , 44 } --> NULL ]\n";

        assertEquals(expected, idsTable.toString());
    }

    @Test public void testHashTableRetrieveValueFromBucketHasCollision() {
        Hashtable<Integer> idsTable = new Hashtable();
        idsTable.add("Mohamad",11);
        idsTable.add("Yaser",22);
        idsTable.add("cdd",33);
        idsTable.add("abc",44);

        String expected =   "6 : [  { Yaser , 22 } --> NULL ]\n" +
                "10 : [  { Mohamad , 11 } -->  { cdd , 33 } --> NULL ]\n" +
                "84 : [  { abc , 44 } --> NULL ]\n";

        assertEquals(expected, idsTable.toString());

        int output1 = idsTable.get("cdd");
        int output2 = idsTable.get("Mohamad");
        assertEquals(11, output2);
        assertEquals(33, output1);

    }

}
