
public interface Deque<T>{

    //adds a value to the front
    public void addFirst ( T val );
    
    //adds a value to the end
    public void addLast ( T val );

    //removes a value from the front
    public T removeFirst ();

    //removes a value from the end
    public T removeLast ();

    //retrieves value at front
    public T offerFirst ();

    //retrieves value from end
    public T offerLast ();

    public boolean isEmpty();


}
