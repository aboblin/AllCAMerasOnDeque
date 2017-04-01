// Team AllCAMerasOnDeque (Carol Pan, Adrian Boylan, Mark Shafran)
// APCS2 pd05
// Lab02--All Hands On Deque!
// 2017-04-04

public class DLLDeque<T> implements Deque<T>{
    
    private DLLNode<T> _first, _last;
    public int _size;

    public DLLDeque() {
	_first = _last = null;
	_size = 0;
    }

    public void addFirst (T val) {

	if (isEmpty()) {
	    _first.setCargo(val);
	    _last = _first;
	    _size++;
	    return;
	}
	_first.setPrev(new DLLNode<T>(val, null, _first));
	_first = getPrev();
	_size++;
	return;
    }

    public void addLast(T val) {
	if (isEmpty()) {
	    _last.setCargo(val);
	    _first = _last;
	    _size++;
	    return;
	}
	_last.setNext(new DLLNode<T>(val, _last, null));
	_last = _last.getNext();
	_size++;
	return;
    }

    public T removeFirst() {
        if (isEmpty())
	    {throw new IndexOutOfBoundsException("There is no element to remove");}
	T temp = _first.getCargo();
	_first = _first.getNext();
	_size++;
	return temp;
    }

    public T removeLast() {
        if (isEmpty())
	    {throw new IndexOutOfBoundsException("There is no element to remove");}
	T temp = _first.getCargo();
	_first = _first.getNext();
	_size++;
	return temp;
    }

    public T offerFirst() {
        return _first.getCargo();
}

    public T offerLast() {
	return _last.getCargo()
    }

    public boolean isEmpty() {
	return (_size==0);
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
