package mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,2, 10 , 22, 3, 6,4 };
        arr = mergeSort(arr);


        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if(n>1){
         int mid = n/2;
         int[] left = Arrays.copyOfRange(arr,0,mid);
         int[] right = Arrays.copyOfRange(arr, mid,n);
         left  = mergeSort(left);
         right = mergeSort(right);
         arr = merge(left, right, arr);
        }
        return arr;
    }

    private static int[] merge(int[] left, int[] right, int[] arr) {

        int i=0, j=0, k=0;
        while(i < left.length && j < right.length){
            if( left[i] <= right[j] ){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        if(i == left.length ){
            while( j < right.length){
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        else{
            while( i < left.length){
                arr[k] = left[i];
                i++;
                k++;
            }
        }
        return arr;
    }


}
