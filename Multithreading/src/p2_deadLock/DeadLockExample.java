package p2_deadLock;

public class DeadLockExample {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		// Thread 1 trying to acquire lock1 and then lock2
		Thread t1 = new Thread(() -> {
			synchronized(lock1) {
				System.out.println("Thread 1: holding lock1...");
				try {
					Thread.sleep(100);
					System.out.println("Thread 1: waiting for lock2");
					synchronized (lock2) {
						System.out.println("Thread 1: holding lock2");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			synchronized(lock2) {
				System.out.println("Thread 2: holding lock2...");
				try {
					Thread.sleep(100);
					System.out.println("Thread 2: waiting for lock1");
					synchronized (lock1) {
						System.out.println("Thread 2: holding lock1");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}
	// we may use Reentrantlock object to get out of the deadlock
}
