
# Reverse an Array

print out an array in reverse order

## Challenge

this program should take an array and return it in reverse order.

## Approach & Efficiency

I used two pointers to replace the elements inside the array and go through it until the two pointers meet each other

## Solution

![Whiteboard_ArrayReversed](./assets/Array-reverse.png)

### ----------------------------------------

# Array Shift

insert an element in the middle of the array and shift the other elements

## Challenge

this program should take an array and an element, then should insert this element in the middle of the array and shift the other elements to the end, finally return the new inserted shifted array.

## Approach & Efficiency

create new array of size n+1 
use two pointers to set the first half of the new array exactly as the first half of the old one
and set the second half of the new array after one position of the second half of the old array
* when the pointer reach the middle, stop the loop and insert the element.

## Solution

![Whiteboard_ArrayShift](./assets/array-shift.png)

### ----------------------------------------

# Binary search in a sorted 1D array

find an element in a sorted array using binary search algorithm 

## Challenge

this program should take an array and an element, then should return the index of the array that hold this element if found, else, return -1.

## Approach & Efficiency

start comparing the element with the middle element in the array
if the middle number larger than the element , then ignore the left half of the array and start searching again from the middle of the right half
if the middle number was smaller , then ignore the right side and repeat the process until find the element or te high and low pointing on the same place


## Solution

![Whiteboard_BinarySearch](./assets/array-binary-search.png)
