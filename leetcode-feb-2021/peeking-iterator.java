import java.util.NoSuchElementException;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;
    private Integer peekedValue = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (peekedValue == null) {
            if (!iter.hasNext()) throw new NoSuchElementException();
            peekedValue = iter.next();
        }
        return peekedValue;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if (peekedValue != null) {
            Integer returnedValue = peekedValue;
            peekedValue = null;
            return returnedValue;
        } 
	    if (!iter.hasNext()) throw new NoSuchElementException();
        return iter.next();
	}
	
	@Override
	public boolean hasNext() {
	    return peekedValue != null || iter.hasNext();
	}
}