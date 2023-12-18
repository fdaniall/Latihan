package iterator;

import java.util.ArrayList;

public class FIFOIterator<T> implements Iterator<T>{
	
	private ArrayList<T> list;
	private Integer currIdx;
	
	public FIFOIterator(ArrayList<T> list) {
		super();
		this.list = list;
		currIdx = 0;
	}
	@Override
	public T getNext() {
		if(hasNext()) {
			return list.get(currIdx++);
		}
		return null;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currIdx < list.size();
	}
}