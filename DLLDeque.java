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
	if (isEmpty()) {
	    _first = new DLLNode<T>(val, null, null);
	    _last = _first;
	    _size++;
	    return;
	}
	//otherwise, add to front
	_first.setPrev(new DLLNode<T>(val, null, _first));
	//shift pointer over
	_first = _first.getPrev();
	_size++;
	return;
    }//O(1)


    //adds new value to the back
    public void addLast(T val) {
	//make sure the data structure isn't empty
	if (isEmpty()) {
	    _last = new DLLNode<T>(val, null, null);
	    _first = _last;
	    _size++;
	    return;
	}
	//otherwise, add to back
	_last.setNext(new DLLNode<T>(val, _last, null));
	//shift pointer over
	_last = _last.getNext();
	_size++;
	return;
    }//O(1)

    //removes first value from the front
    public T removeFirst() {
	//make sure the data structure isn't empty
        if (isEmpty())
	    {throw new IndexOutOfBoundsException("There is no element to remove");}
	//otherwise, store and remove
	T temp = _first.getCargo();
	//shift pointer over
	_first = _first.getNext();
	_size--;
	return temp;
    }//O(1)

    //removes last value from the back
    public T removeLast() {
	//make sure the data structure isn't empty
        if (isEmpty())
	    {throw new IndexOutOfBoundsException("There is no element to remove");}
	//otherwise, store and remove
	T temp = _last.getCargo();
	//shift pointer over
	_last = _last.getPrev();
	_size--;
	return temp;
    }//O(1)

    //returns the first value in the deque
    public T offerFirst() {
        return _first.getCargo();
    }//O(1)

    //returns the last value in the deque
    public T offerLast() {
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

}//end
