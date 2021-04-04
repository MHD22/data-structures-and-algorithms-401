public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = reverseArray(arr);
        printArray(arr);

    }

    public static int[] reverseArray(int[] arr){
        int size = arr.length;
        int left = 0;
        int right = size-1;

        while (left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for ( int x : arr ) {
            System.out.print(x+" ");
        }
    }
}
