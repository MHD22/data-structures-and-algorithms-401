/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quickSort;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testQuickSortWithNormalArray() {
        QuickSort quickSort = new QuickSort();

        int[] arr = {8,4,23,42,16,15};

        int[] sorted = quickSort.sort(arr);

        int[] expected = {4,8,15,16,23,42};
        assertArrayEquals(expected,sorted);
    }

    @Test public void testQuickSortWithAlreadySortedArray() {
        QuickSort quickSort = new QuickSort();

        int[] arr = {1,2,3,4,5};

        int[] sorted = quickSort.sort(arr);

        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected,sorted);
    }


    @Test public void testQuickSortWithReversedArray() {
        QuickSort quickSort = new QuickSort();

        int[] arr = {5,4,3,2,1};

        int[] sorted = quickSort.sort(arr);

        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected,sorted);
    }


    @Test public void testQuickSortWithEmptyArray() {
        QuickSort quickSort = new QuickSort();

        int[] arr = {};

        int[] sorted = quickSort.sort(arr);

        int[] expected = {};
        assertArrayEquals(expected,sorted);
    }


    @Test public void testQuickSortWithArrayOfOneElement() {
        QuickSort quickSort = new QuickSort();

        int[] arr = {8};

        int[] sorted = quickSort.sort(arr);

        int[] expected = {8};
        assertArrayEquals(expected,sorted);
    }





}
