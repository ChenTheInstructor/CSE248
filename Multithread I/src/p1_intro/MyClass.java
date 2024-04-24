package p1_intro;

public class MyClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("Starting another thread: " + Thread.currentThread().getName());
		for(int i = 0; i < 1000; i++) {
			System.out.println("Hi " + i);
		}
	}
}
