# AllCAMerasOnDeque

Carol Pan, Adrian Boylan, Mark Shafran

Method Selection Choices:

1. void addFirst ( T val );
2. void addLast ( T val );
3. T removeFirst ();
4. T removeLast ();
5. T offerFirst ();
6. T offerLast ();
7. boolen isEmpty();
8. String toString();

We chose a doubly-linked node-based architecture because we found that all the methods we chose to implement other than the toString() method would have a constant runtime, O(1).
