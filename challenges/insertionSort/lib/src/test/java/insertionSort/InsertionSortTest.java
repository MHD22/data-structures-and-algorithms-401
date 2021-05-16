package insertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void testInsertionSortWithNormalArray(){
        int[] array = {8,4,23,42,16,15};
        int[] outputArray = InsertionSort.insertionSort(array);
        int[] expectedOutput = {4,8,15,16,23,42};
        assertArrayEquals(expectedOutput,outputArray);
    }

    @Test
    public void testInsertionSortWithEmptyArray(){
        int[] array = {};
        int[] outputArray = InsertionSort.insertionSort(array);
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput,outputArray);
    }

    @Test
    public void testInsertionSortWithArrayOfSizeOne(){
        int[] array = {8};
        int[] outputArray = InsertionSort.insertionSort(array);
        int[] expectedOutput = {8};
        assertArrayEquals(expectedOutput,outputArray);
    }

    @Test
    public void testInsertionSortWithAlreadySortedArray(){
        int[] array = {1,2,3,4,5};
        int[] outputArray = InsertionSort.insertionSort(array);
        int[] expectedOutput = {1,2,3,4,5};
        assertArrayEquals(expectedOutput,outputArray);
    }

    @Test
    public void testInsertionSortWithReverseSortedArray(){
        int[] array = {5,4,3,2,1};
        int[] outputArray = InsertionSort.insertionSort(array);
        int[] expectedOutput = {1,2,3,4,5};
        assertArrayEquals(expectedOutput,outputArray);
    }
}
