package has_a;

import java.util.Stack;

public class MyStack {
	private Stack<Integer> stack;
	
	
	public MyStack() {
		stack = new Stack<>();
	}
	
	public void push(Integer value) {
		stack.push(value);
	}
}
