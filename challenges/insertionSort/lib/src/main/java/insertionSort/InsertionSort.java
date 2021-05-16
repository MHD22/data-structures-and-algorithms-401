package insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array){
        if(array.length <=1)
            return array;

        int j;
        for(int i = 1 ; i< array.length; i++){
            int temp = array[i];

            for ( j = i-1; j>=0 && temp < array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
        return array;
    }



}
