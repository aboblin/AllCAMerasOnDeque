# AllCAMerasOnDeque

Carol Pan, Adrian Boylan, Mark Shafran 
Period 5

Method Selection Choices:

void addFirst ( T val );
void addLast ( T val );
T removeFirst ();
T removeLast ();
T offerFirst ();
T offerLast ();
boolen isEmpty();
String toString();

We chose a doubly-linked node-based architecture because we found that all the methods we chose to implement other than the toString() method would have a constant runtime, O(1).
