
public class UseStack {

	// implement this method.
	public static Stack sort(Stack s) throws Exception {
		if(s.isEmpty()) return s;
		ArrayListStack tempS = new ArrayListStack();
		while (!s.isEmpty()) {
			int temp = s.top();
			s.pop();
			while (!tempS.isEmpty() && tempS.top() < temp) {
				s.push(tempS.top());
				tempS.pop();
			}
			tempS.push(temp);
		}
		return tempS;
	}

}
