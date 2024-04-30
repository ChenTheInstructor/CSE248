package p1_2;

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		t1.start();
//		t2.start();
		System.out.println("Main Thread: " + Thread.currentThread().getName());
		System.out.println("Main Thread is done.");
	}

}
