package p10_semaphore;

import java.util.concurrent.Semaphore;

public class MainSemaphore {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);
		for(int i = 1; i <= 5; i++) {
			Thread t = new Thread(new Worker(i, semaphore));
			t.start();
		}
		
	}

}
