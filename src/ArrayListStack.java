import java.util.ArrayList;

public class ArrayListStack implements Stack {
	private ArrayList<Integer> a;
	private static final int DEFAULT_SIZE = 10;

	// implement a default constructor and all methods from interface Stack.
	// Additional methods maybe required in order to run tests.
	public ArrayListStack() {
		a = new ArrayList<Integer>(DEFAULT_SIZE);
	}

	public ArrayList<Integer> getA() {
		return a;
	}

	@Override
	public boolean isEmpty() {
		return a.isEmpty();
	}

	@Override
	public boolean isFull() {
		return a.size() == DEFAULT_SIZE;
	}

	@Override
	public void makeEmpty() {
		a.clear();
	}

	@Override
	public int top() throws Exception {
		return a.get(a.size() - 1);
	}

	@Override
	public void pop() throws Exception {
		a.remove(a.size() - 1);
	}

	@Override
	public void push(int data) throws Exception {
		if(!this.isFull()) {
			a.add(data);
		}	
	}

}
