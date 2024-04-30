package p1_3;

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("Hi from runnable."));
		
		Thread t2 = new Thread(() -> System.out.println("Bye from runnable."));
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("The main thread is done.");
	}

}
