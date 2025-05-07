package p1_thread_creation;

public class Main1 {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("This is the main thread.");
		System.out.println(Thread.currentThread().getName());
	}
}
