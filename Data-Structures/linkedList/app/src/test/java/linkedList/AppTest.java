/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    LinkedList testList = new LinkedList();

    @Test
    public void testEmptyLinkedList() {
        String output = testList.toString();
        assertEquals("Must be NULL", "NULL", output);
    }

    @Test
    public void testInsertToList() {
        testList.insert(7);
        String output = testList.toString();
        assertEquals("Must be { 7 } --> Null", " { 7 } --> NULL", output);
    }

    @Test
    public void testHeadValue() {
        testList.insert(7);
        int output = testList.head.value;
        assertEquals("Must be 7", 7, output);
    }

    @Test
    public void testInsertMultipleToList() {
        testList.insert(7);
        testList.insert(6);
        testList.insert(5);
        testList.insert(4);
        String output = testList.toString();
        String expected = " { 4 } -->  { 5 } -->  { 6 } -->  { 7 } --> NULL";
        assertEquals("Must be  { 4 } -->  { 5 } -->  { 6 } -->  { 7 } --> NULL", expected, output);
    }

    @Test
    public void testIncludeExistValue() {
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        boolean isFound = testList.includes(8);
        assertTrue("Must be true", isFound);
    }

    @Test
    public void testIncludeNonExistValue() {
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        boolean isFound = testList.includes(22);
        assertFalse("Must be true", isFound);
    }

    @Test
    public void testAddNodesToTheEnd() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected, output);
    }

    @Test
    public void testInsertBeforeTheMiddleValue() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertBefore(11, 22);
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 22 } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected, output);
    }

    @Test
    public void testInsertBeforeTheFirstValue() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertBefore(7, 22);
        String output = testList.toString();
        String expected = " { 22 } -->  { 7 } -->  { 10 } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected, output);
    }

    @Test
    public void testInsertAfterTheMiddleValue() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertAfter(11, 22);
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { 22 } -->  { 12 } --> NULL";
        assertEquals(expected, output);
    }

    @Test
    public void testInsertAfterTheLastValue() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertAfter(12, 22);
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { 12 } -->  { 22 } --> NULL";
        assertEquals(expected, output);
    }

    @Test
    public void testKthFromEndWhen_K_isGraterThanTheLengthOfList() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        int output = testList.kthFromEnd(5);
        int expected = -1;
        assertEquals("The output must be -1", expected, output);
    }

    @Test
    public void testKthFromEndWhen_K_isEqualToTheLengthOfList() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        int output = testList.kthFromEnd(4);
        int expected = -1;
        assertEquals("The output must be -1", expected, output);
    }

    @Test
    public void testKthFromEndWhen_K_isNegativeNumber() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        int output = testList.kthFromEnd(-4);
        int expected = -1;
        assertEquals("The output must be -1", expected, output);
    }

    @Test
    public void testKthFromEndWhenTheSizeOfTheListIsOne() {
        testList.insert(7);//the first element (head)
        int output = testList.kthFromEnd(0);
        int expected = 7;
        assertEquals("The output must be 7", expected, output);
        output = testList.kthFromEnd(1);
        expected = -1;
        assertEquals("The output must be -1", expected, output);
    }

    @Test
    public void testKthFromEndWhen_K_InTheMiddleOfTheList() {
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.append(10);
        testList.append(11);
        testList.append(12);
        int output = testList.kthFromEnd(5);
        int expected = 10;
        assertEquals("The output must be 10", expected, output);
        output = testList.kthFromEnd(3);
        expected = 12;
        assertEquals("The output must be 12", expected, output);
    }


}
