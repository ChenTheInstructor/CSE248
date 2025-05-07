package p9_countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable {
	private CountDownLatch latch; // semaphore
	
	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		System.out.println("A new thread started...");
		try {
			Thread.sleep(1000);// assuming doing work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The new thread is complete");
		latch.countDown();
	}
}
