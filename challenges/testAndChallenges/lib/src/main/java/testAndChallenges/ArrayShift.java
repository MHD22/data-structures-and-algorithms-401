package testAndChallenges;

public class ArrayShift {

    public  int[] insertShiftArray(int[] arr , int newElement){
        int[] newArray = new int[arr.length+1];
        int leftPointer = 0;
        int rightPointer=newArray.length-1;

        while (leftPointer < rightPointer) {

            newArray[leftPointer] = arr[leftPointer];
            newArray[rightPointer] = arr[rightPointer-1];
            leftPointer++;
            rightPointer--;

        }
        newArray[leftPointer] = newElement;

        return newArray;
    }
}
