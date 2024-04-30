package p7_wait_notify;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Object lock = new Object();

		Thread t1 = new Thread(() -> {
			
			synchronized (lock) {
				System.out.println("Thread 1 starts with the lock.");
				System.out.println("Producer thread t1 is running...");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("Thread 1 resumed without the lock.");
		});

		Thread t2 = new Thread(() -> {
			Scanner scanner = new Scanner(System.in);
			try {
				Thread.sleep(1000);
				synchronized(lock) {
					System.out.println("Waiting for ENTER key: ");
					scanner.nextLine();
					System.out.println("The ENTER key is pressed.");
					lock.notify();
					Thread.sleep(10000);
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
	}

}
