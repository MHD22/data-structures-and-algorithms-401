package binarySearch;

public class BinarySearch {
    public int binarySearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (arr[mid] > element) {
                high = mid - 1;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                index = mid;
                return index;
            }

            mid = (low + high) / 2;
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        int[] arr = {1, 3, 5, 6, 8, 9, 10};
        int index = binary.binarySearch(arr, 6);
        int index2 = binary.binarySearch(arr, 1);
        int index3 = binary.binarySearch(arr, 5);
        int index4 = binary.binarySearch(arr, 22);
        System.out.println(index + "  " + index2 +"  "+ index3 +"  "+index4);
    }

}