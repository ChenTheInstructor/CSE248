package p10_semaphore;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
	private int id;
	private Semaphore semaphore;

	public Worker(int id, Semaphore semaphore) {
		this.id = id;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		System.out.println("Thread " + id + " is trying to acquire a permit.");
		try {
			semaphore.acquire();
			System.out.println("Thread " + id + " has acquired a permit.");
			Thread.sleep(5000);
			System.out.println("Thread " + id + " has finished its work and is releasing the permit");
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
