package p8_deadlock;

public class MainDeadLock {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		Thread t1 = new Thread( () -> {
			synchronized(lock1) {
				System.out.println("t1 is holding lock1...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("t1 is waiting for lock2...");
				synchronized(lock2) {
					System.out.println("t1 acquired lock2");
				}
			}
		});
		
		Thread t2 = new Thread( () -> {
			synchronized(lock2) {
				System.out.println("t2 is holding lock2...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("t2 is waiting for lock1...");
				synchronized(lock1) {
					System.out.println("t2 acquired lock1");
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
