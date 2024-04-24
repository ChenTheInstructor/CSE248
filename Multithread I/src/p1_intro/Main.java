package p1_intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
		new MyClass().start();
		System.out.println("End");
	}

}
