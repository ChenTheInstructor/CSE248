package p10_reentrantlock;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void thread1() {
		lock.lock();// try to acquire a lock
		System.out.println("Thread1 waiting...");
		try {
			cond.await();// Thread paused, give up the lock
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Woken up!");
		System.out.println("Thread 1 is incrementing...");
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}
	
	public void thread2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		lock.lock();
		if(lock.tryLock(50, TimeUnit.MILLISECONDS)) { {
			System.out.println("Hello, a lock is acquired.");
		}
		
		System.out.println("Press the return key on Thread 2...");
		new Scanner(System.in).nextLine();
		System.out.println("Got the return key on Thread 2.");
		cond.signal(); // waking up sleeping threads without giving up the lock
		System.out.println("Thread 2 is incrementing...");
		try {
			increment();
		} finally {
			lock.unlock(); // give up the lock
		}
	}
	
	public void finished() {
		System.out.println("Count is: " + count);
	}
}
