package mergeSort;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSortWithNormalArray(){
        int[] arr = {3,2,4,1,5,6};
        arr = MergeSort.mergeSort(arr);
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected,arr);
    }

    @Test
    public void testMergeSortWithAlreadySortedArray(){
        int[] arr = {1,2,3,4,5,6};
        arr = MergeSort.mergeSort(arr);
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected,arr);
    }

    @Test
    public void testMergeSortWithReversedArray(){
        int[] arr = {6,5,4,3,2,1};
        arr = MergeSort.mergeSort(arr);
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected,arr);
    }

    @Test
    public void testMergeSortWithEmptyArray(){
        int[] arr = {};
        arr = MergeSort.mergeSort(arr);
        int[] expected = {};
        assertArrayEquals(expected,arr);
    }

    @Test
    public void testMergeSortWithArrayOfOneElement(){
        int[] arr = {1};
        arr = MergeSort.mergeSort(arr);
        int[] expected = {1};
        assertArrayEquals(expected,arr);
    }

}
