package p1_inheritance;

import java.util.Arrays;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		QuickStackIsAStack<Integer> stack1 = new QuickStackIsAStack<>();
		stack1.push(1);
//		Stack <String >s1 = new Stack<>(); //Vector
//		s1.push("Adam");
		
		stack1.push(100);
		stack1.push(200);
//		System.out.println(stack1.size());
		Integer[] a = {1 , 2, 3, 4, 5};
		stack1.pushAll(a);
//		System.out.println(stack1.size());
		
		System.out.println(Arrays.toString(stack1.popAll()));
	}

}
