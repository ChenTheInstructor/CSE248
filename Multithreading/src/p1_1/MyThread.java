package p1_1;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hi");
	}

}
