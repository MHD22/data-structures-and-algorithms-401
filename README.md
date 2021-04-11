
# Reverse an Array 

[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/main/challenges/ArrayReverse.java)

print out an array in reverse order

## Challenge

this program should take an array and return it in reverse order.

## Approach & Efficiency

I used two pointers to replace the elements inside the array and go through it until the two pointers meet each other

## Solution

![Whiteboard_ArrayReversed](./assets/Array-reverse.png)

### ----------------------------------------

# Array Shift 

[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/main/challenges/ArrayShift.java)

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

[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/main/challenges/BinarySearch.java)

find an element in a sorted array using binary search algorithm 

## Challenge

this program should take an array and an element, then should return the index of the array that hold this element if found, else, return -1.

## Approach & Efficiency

start comparing the element with the middle element in the array
if the middle number larger than the element , then ignore the left half of the array and start searching again from the middle of the right half
if the middle number was smaller , then ignore the right side and repeat the process until find the element or te high and low pointing on the same place


## Solution

![Whiteboard_BinarySearch](./assets/array-binary-search.png)

### ----------------------------------------

# Singly Linked List

[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/linked-list/Data-Structures/linkedList/app/src/main/java/linkedList/LinkedList.java)


You can create Linked list and manipulate it.

## Challenge

writing methods to insert elements in the list, search on specific elements and print the list as a string.

## Approach & Efficiency

There are two main classes ( Node , LinkedList ), each Node has two fields (value, next node)
and the LinkedList has one field which is the (head node)
head will pointing always to the first node of the list, when you need to add value to list, it will take the head place and pointing to the old head.
The time complexity of inserting a value is : `O(1)`
The time complexity of search on a value is : `O(n)`

## API

1. `insert(value);` will insert the passed value as a new head of the list and make its next pointer pointing on the old head.
2. `includes(value);` will search through the list on the passed value, if it find the value .. the method will return true. else, will return false.
3. `toString();` will print out the whole linked list as a string to the user.

### ----------------------------------------

# Singly Linked List, add more implementations.

[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/blob/linked-list/Data-Structures/linkedList/app/src/main/java/linkedList/LinkedList.java)

# Challenge Summary

More implementaitons on linked list, like (insert before, insert after, append).

## Challenge Description

Need add the following methods:

* `addBefore(val, newVal)`: to search and add a new value before a specific one.
* `addAfter(val, newVal)`: to search and add a new value after a specific one.
* `append(val)`: to add a new value to the end of the list.

## Approach & Efficiency

* with the (addBefore AND addAfter) methods, will start from the head and search on the specific value, if it found.. add the new value before or after it. If not, then print out a message or exception that tell the user the value is not exist.

* the append method: start from head and step through the last element, then add the new value there.

## Solution

![Whiteboard_LinkedList](./assets/ll-insertions.png)

### ----------------------------------------
