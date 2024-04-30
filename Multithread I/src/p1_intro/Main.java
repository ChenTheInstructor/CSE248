package p1_intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
		Thread myThread1 = new MyClass();
		Thread myThread2 = new MyClass();
		myThread1.start();
		myThread2.start();
		
		try {
			myThread1.join();
			myThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
