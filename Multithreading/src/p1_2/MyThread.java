package p1_2;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hi from runnable.");
	}

}
