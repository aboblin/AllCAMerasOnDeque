// Team AllCAMerasOnDeque (Carol Pan, Adrian Boylan, Mark Shafran)
// APCS2 pd05
// Lab02--All Hands On Deque!
// 2017-04-04

public class DLLDeque<T> implements Deque<T>{
    
    //~~~~~~~~~~~intsance vars~~~~~~~~~~~~~
    private DLLNode<T> _first, _last;
    public int _size;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //~~~~~~~~~~~contructor~~~~~~~~~~~~~~~~
    public DLLDeque() {
	_first = _last = null;
	_size = 0;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    //~~~~~~~~~~~~methods~~~~~~~~~~~~~~~~~~~
    
    //adds new value to the front
    public void addFirst (T val) {
	//make sure the data structure isn't empty
	if (isEmpty()) { // if making first node
	    _first = new DLLNode<T>(val, null, null); //makes the first node a new DLLNode with cargo = val, and no next or prev node
	    _last = _first; // since this is the only node, it is the first and also the last
	    _size++;// size increased by one, no longer empty
	    return;
	}
	//otherwise, add to front
	_first.setPrev(new DLLNode<T>(val, null, _first)); // new first node with cargo = val, next node = old first node
	_first = _first.getPrev(); // moves pointer from the old first node to the new first node
	_size++;// size increased by one
	return;
    }//O(1)


    //adds new value to the back
    public void addLast(T val) {
	//make sure the data structure isn't empty
	if (isEmpty()) {// if making first node
	    _last = new DLLNode<T>(val, null, null);//makes the last node a new DLLNode with cargo = val, and no next or prev node
	    _first = _last;// since this is the only node, it is the last and also the first
	    _size++;// size increased by one
	    return;
	}
	//otherwise, add to back
	_last.setNext(new DLLNode<T>(val, _last, null));// new last node with cargo = val, prev node = old last node
	_last = _last.getNext(); // moves pointer from the old last node to the new last node
	_size++;// size increased by one
	return;
    }//O(1)

    //removes first value from the front
    public T removeFirst() {
	//make sure the data structure isn't empty
        if (isEmpty()) //if no first to remove
	    {throw new IndexOutOfBoundsException("There is no element to remove");}
	//otherwise, store and remove
	T temp = _first.getCargo();// store old first val as temp variable
	_first = _first.getNext(); //move pointer to next node after old first node
	_size--; // decrease size by one
	return temp; // return old val of first
    }//O(1)

    //removes last value from the back
    public T removeLast() {
	//make sure the data structure isn't empty
        if (isEmpty())//if no last to remove
	    {throw new IndexOutOfBoundsException("There is no element to remove");}
	//otherwise, store and remove
	T temp = _last.getCargo();// store old last val as temp variable
	_last = _last.getPrev(); //move pointer to prev node before old last node
	_size--;// decrease size by one
	return temp;// return old val of the last
    }//O(1)

    //returns the first value in the deque
    public T peekFirst() {
	if (_size == 0){
	    return null;
	}
        return _first.getCargo();
    }//O(1)

    //returns the last value in the deque
    public T peekLast() {
	if (_size == 0){
	    return null;
	}
	return _last.getCargo();
    }

    //is the list empty?
    public boolean isEmpty() {
	return (_size==0);
    }//O(1)

    //standard toString method
    public String toString() { 
	String foo = "";
	DLLNode<T> tmp = _first;
	while ( tmp != null ) {
	    foo += tmp + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }//O(n)
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static void main( String[] args ) 
    {
        Deque<String> PirateDeque = new DLLDeque<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateDeque.addFirst("Dread");
	PirateDeque.addFirst("Pirate");
	PirateDeque.addFirst("Robert");
	PirateDeque.addFirst("Blackbeard");
	PirateDeque.addFirst("Peter");
	PirateDeque.addFirst("Stuyvesant");
	PirateDeque.addLast("Dread");
	PirateDeque.addLast("Pirate");
	PirateDeque.addLast("Robert");
	PirateDeque.addLast("Blackbeard");
	PirateDeque.addLast("Peter");
	PirateDeque.addLast("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateDeque ); //for testing toString()...

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateDeque.removeLast() );
	System.out.println( PirateDeque.removeLast() );
	System.out.println( PirateDeque.removeLast() );
	System.out.println( PirateDeque.removeLast() );
	System.out.println( PirateDeque.removeLast() );
	System.out.println( PirateDeque.removeLast() );
	System.out.println( PirateDeque.removeFirst() );
	System.out.println( PirateDeque.removeFirst() );
	System.out.println( PirateDeque.removeFirst() );
	System.out.println( PirateDeque.removeFirst() );
	System.out.println( PirateDeque.removeFirst() );
	System.out.println( PirateDeque.removeFirst() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateDeque.removeFirst() );
	System.out.println( PirateDeque.removeLast() );
    }//end main method
}//end DLLDeque
