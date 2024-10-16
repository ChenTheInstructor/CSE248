package p1_inheritance;

import java.util.Stack;

public class QuickStackHasAStack<T> {
	private Stack<T> stack;

	public QuickStackHasAStack() {
		stack = new Stack<>();
	}

	public void pushAll(T[] arr) {
		for (T value : arr) {
			stack.push(value);
		}
	}
	
	public T[] popAll() {
		if(stack.isEmpty()) {
			return (T[])new Object[0];
		}
		
		T[] tempArr = (T[])new Object[stack.size()];
		int count = 0;
		while(!stack.isEmpty()) {
			tempArr[count++] = stack.pop();
		}
		
		return tempArr;
	}
}
