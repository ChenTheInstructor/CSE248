package p8_wait_notify;

import java.util.Scanner;

public class WaitNotifyExample {

	public static void main(String[] args) {
		Object lock = new Object();

		Thread t1 = new Thread(() -> {
			synchronized (lock) {
				System.out.println("Thread1 is running...");
				try {
					lock.wait();// pause the current thread, release the lock
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 is resumed and finished.");
			}
		});

		Thread t2 = new Thread(() -> {
			Scanner scanner = new Scanner(System.in);
			try {
				Thread.sleep(1000);
				synchronized (lock) {
					System.out.println("Waiting for return key...");
					scanner.nextLine();
					System.out.println("The return key was pressed.");
					lock.notifyAll();
					Thread.sleep(5000);
					System.out.println("Thread2 waking up from 5 seconds sleep!");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread is done.");
	}

}
