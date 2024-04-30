package p8_resolve_deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ResolveDeadLock {
	private ReentrantLock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		ResolveDeadLock rdl = new ResolveDeadLock();
		Thread t1 = new Thread(() -> {
			rdl.performTaskWithTimeOut();
		});
		t1.start();
	}

	public void performTaskWithTimeOut() {
		try {
			if(lock.tryLock(500, TimeUnit.MILLISECONDS)) {
				try {
					System.out.println("task is being performed.");
				} finally {
					lock.unlock();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
