package p1_thread_creation;

public class Main4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi!");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Bye!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t4 = new Thread(() -> System.out.println("Lambda Expression"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Main Thread is about to finish.");
	}

}
