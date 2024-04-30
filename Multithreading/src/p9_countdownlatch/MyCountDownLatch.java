package p9_countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch implements Runnable {
	private CountDownLatch latch;
	
	public MyCountDownLatch(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("My CountDownLatch started.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Latch " + latch.getCount() + " completed.");
		latch.countDown();
		System.out.println("Latch count after countdown: " + latch.getCount());
	}
	
	
}
