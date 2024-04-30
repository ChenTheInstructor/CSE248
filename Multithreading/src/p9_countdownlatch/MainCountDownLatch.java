package p9_countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainCountDownLatch {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(6);
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		for(int i = 0; i < 5; i++) {
			es.submit(new MyCountDownLatch(latch));
		}
		
		es.shutdown();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The main thread is done.");
	}

}
