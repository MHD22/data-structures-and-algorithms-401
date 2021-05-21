###### [back to main list of challenges](https://github.com/MHD22/data-structures-and-algorithms-401#readme)

<hr>

# Quick Sort 

[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/main/challenges/quickSort/app/src/main/java/quickSort/QuickSort.java)

# Challenge Summary

* Write a function that take an array as an argument and sort it using Quick sort algorithm then return the sorted array. 


## Challenge Description

Need add the following method:

* `quickSort(array,left,right)`
this method will take the (array , left , right) as an argument and  sort it using Quick sort algorithm then return the sorted array. and will care about the following cases.

  * If the array is empty => return an empty array.
  * If the array size is one => return the array immediately
  * else.. sort the array inplace and return it.

* `partition(arr,left,right)`
  * this method will put the pivot on its correct order where all the smallest elements than it will be on its left side and all the largest elements on its right side.. then, return the position of the pivot.

* `swap(arr,first,second)`
  * this method will simply swap the element in the first index with the element in the second index.

## Approach & Efficiency

***Merge Sort:***

Given an array..

* if the left less than the right.
* calculate the positiopn of the pivot 
* divide the array into two parts.. one before the pivot and the second after it.. then re call the function quickSort for each part
* when the call stack is empty.. the sort process is done and the array will be sorted. 


# Solution (Blog):

# [quick sort blog =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/main/challenges/quickSort/BLOG.md)
