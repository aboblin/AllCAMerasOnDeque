public class DLLDeque<T> implements Deque<T>{
    
    private DLLNode<T> _first, _last;
    public int _size;

    public DLLDeque() {
	_first = _last = null;
	_size = 0;
    }

    public void addFirst (T val) {

	//implementation here

    }

    public void addLast(T val) {

	//implementation here

    }

    public T removeFirst() {

	//implementation here
	return null;

    }

    public T removeLast() {

	//implementation here
	return null;

    }

    public T offerFirst() {

	//implementation here
	return null;

    }

    public T offerLast() {

	//implementation here
	return null;

    }

    public boolean isEmpty() {
	return true;
    }

    public String toString() { 
	String foo = "";
	LLNode<T> tmp = _front;
	while ( tmp != null ) {
	    foo += tmp.getValue() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }

}//end
