package p1_1;

public class App {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Main Thread State: " + Thread.currentThread().getState());
		
		
		MyThread t1 = new MyThread();
		
		t1.start();
		
		
		MyThread t2 = new MyThread();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T2's state:" + t2.getState());
		System.out.println("T1's state:" + t1.getState());
//		t1.start();
//		t2.start();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Main method is done!");
	}

}
