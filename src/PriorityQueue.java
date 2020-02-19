
public class PriorityQueue {
	MyQueue q;

	public PriorityQueue(MyQueue q) {
		super();
		this.q = q;
	}

	// implement this.
	public void push(int x) throws Exception {
		if (this.q.isFull())
			return;
		this.q.insertLast(x);
		int[] temp = new int[this.q.size()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.q.front();
			this.q.removeFirst();
		}
		int n = temp.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (temp[j] > temp[j + 1]) {
					int tmp = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = tmp;
				}
		for (int i = 0; i < temp.length; i++) {
			this.q.insertLast(temp[i]);
		}

	}

	// implement this.
	public void pop() throws Exception {
		this.q.removeFirst();
	}

	// implement this
	public int top() throws Exception {
		return this.q.front();

	}

}
