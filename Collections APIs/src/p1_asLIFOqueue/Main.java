package p1_asLIFOqueue;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<>();
		dq.addLast(1);
		dq.addLast(2);
		dq.addLast(3);
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addFirst(30);
		Queue q = Collections.asLifoQueue(dq);
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
