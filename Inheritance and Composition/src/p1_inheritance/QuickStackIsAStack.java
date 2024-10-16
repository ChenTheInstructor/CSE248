package p1_inheritance;

import java.util.Stack;

public class QuickStackIsAStack <T> extends Stack<T>{
//	private Stack <T> stack; // generic
	
//	public QuickStackIsAStack () {
//		this.stack = new Stack<>();
//	}
	
//	public QuickStackIsAStack() {
////		super();
//	}
	
	public void pushAll(T[] arr) {
		for(T value : arr) {
			push(value);
		}
	}
	
	public T[] popAll() {
		if(isEmpty()) {
			return (T[])new Object[0];
		}
		
		T[] tempArr = (T[])new Object[size()];
		int count = 0;
		while(!isEmpty()) {
			tempArr[count++] = pop();
		}
		
		return tempArr;
	}

}
