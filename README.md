# AllCAMerasOnDeque

## Carol Pan, Adrian Boylan, Mark Shafran

### Deque Explanation:

A Deque is a linear collection that allows for insertion on both the front and the back ends. Deque is actually short for "double ended queue," and much like a queue it has method for adding, removing, and offering but instead of methods solely focusing on the front of the collection, it also accesses the end of the collection.

### Method Selection Choices:

- ```void addFirst ( T val );```//Adds value to the front of the Deque
- ```void addLast ( T val );``` //Adds value to the end of the Deque
- ```T removeFirst ();``` //Removes the value at the front of the Deque; Returns removed value
- ```T removeLast ();``` //Removes the value at the end of the Deque; Returns removed value
- ```T peekFirst ();``` //Returns the value at the front of the Deque, without modifying the Deque
- ```T peekLast ();``` //Returns the value at the end of the Deque, without modifying the Deque
- ```boolen isEmpty();``` //Returns true if the Deque is empty  (AKA \_size == 0); false otherwise
- ```String toString();``` //Returns the string representation of the Deque

We chose a doubly-linked node-based architecture because we found that almost all of the methods we chose to implement have a  constant runtime, or O(1). The only exception is toString(), which would has a linear, or O(n), runtime.

### 2017-04-05: Updates
- ```offer``` robustified in order to catch empty deques
- ```offer``` changed to ```peek```
