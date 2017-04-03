# AllCAMerasOnDeque

Carol Pan, Adrian Boylan, Mark Shafran

Method Selection Choices:

1. void addFirst ( T val ); //Adds value to the front of the Deque
2. void addLast ( T val ); //Adds value to the end of the Deque
3. T removeFirst (); //Removes the value at the front of the Deque; Returns removed value
4. T removeLast (); //Removes the value at the end of the Deque; Returns removed value
5. T offerFirst (); //Returns the value at the front of the Deque, without modifying the Deque
6. T offerLast (); //Returns the value at the end of the Deque, without modifying the Deque
7. boolen isEmpty(); //Returns true if the Deque is empty  (AKA \_size == 0); false otherwise
8. String toString(); //Returns the string representation of the Deque

We chose a doubly-linked node-based architecture because we found that all the methods we chose to implement other than the toString() method would have a constant runtime, O(1).
