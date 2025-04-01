package is_a_2;

import java.util.PriorityQueue;
import java.util.Stack;

public class MyStackAndPQ {
	private Stack<Integer> stack;
	private PriorityQueue<Integer> pq;
	
	public MyStackAndPQ() {
		stack = new Stack<>();
		pq = new PriorityQueue<>();
	}
	
	public void add(Integer value) {
		stack.push(value);
		pq.add(value);
	}
	
	public Integer pop() {
		return stack.pop();
	}

}
