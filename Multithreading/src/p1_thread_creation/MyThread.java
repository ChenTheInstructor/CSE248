package p1_thread_creation;

public class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello " + i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
