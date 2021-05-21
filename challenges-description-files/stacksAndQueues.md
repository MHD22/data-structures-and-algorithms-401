###### [back to main list of challenges](https://github.com/MHD22/data-structures-and-algorithms-401#readme)

<hr>

# Stacks and Queues
[Source code =>](https://github.com/MHD22/data-structures-and-algorithms-401/tree/main/Data-Structures/stacksandqueues/app/src/main/java/stacksandqueues)

>This app must implement the Stack and Queue data structures.

## Challenge

implement the methods related to manipulate a stack and queue successfully with any type of elements inside them.

## Approach & Efficiency

* create a Node class which take a value (whatever its type ) and the next properties.
* create a stack class and add the required and the appropriate methods to it.
* add the top and size fields to the stack .. top will always pointing to the top values of the stack 
* if the stack was empty.. the top will point on null.

* create a queue class and add the required and the appropriate methods to it.
* add the front, rear, and size field to this class..
* front will pointing on the oldest element entered the queue and the rear will pointin on the newest one.
* When dequeue from the stack will return the front element.
* when enqueue to the stack will add as a rear element.

## API

***For stack:***

* `push(T value)` => will add a value into the top of the stack.
* `pop()` => will pop up the top value of the stack and return it to the user.
* `peek()` => will return the value of the top of the stack without remove it from the stack.
* `isEmpty()` => will return true if the stack is empty, otherwise.. false.

***For queue:***

* `enqueue(T value)` => will add a value into the front of the queue.
* `dequeue()`=> will dequeue out the rear value of the queue and return it to the user.
* `peek()` => will return the rear value of the queue without remove it from the queue.
* `isEmpty()` => will return true if the queue is empty, otherwise.. false.