package p3_sync_dealock_solution;

public class SynchronizedWaitNotifyExample {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		// Thread 1 trying to acquire lock1 and then lock2
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		
		// Thread 2 trying to acquire lock2 and then lock1
		Thread t2 = new Thread(() -> {
			synchronized(lock1) {
				System.out.println("Thread 2: holding lock1...");
				try {
					Thread.sleep(100);
					System.out.println("Thread 2: waiting for lock2");
					synchronized (lock2) {
						System.out.println("Thread 2: holding lock2");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		System.out.println("The main thread is done.");
	}

}
