package p6_synchronized_code_block;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SynchronizedCodeBlockExample {
	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private List<Integer> list1 = new LinkedList<>();
	private List<Integer> list2 = new LinkedList<>();

	public void addToBothListsInThreads() {
		Thread t1 = new Thread(() -> {
			addToBothLists();
		});

		Thread t2 = new Thread(() -> {
			addToBothLists();
		});

		long start = System.currentTimeMillis();
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start));
		System.out.println("List1 size: " + list1.size() + ", " + "List2 size: " + list2.size());
	}

	public void addToBothLists() {
		for (int i = 0; i < 1000; i++) {
			addToList1();
			addToList2();
		}
	}

	public void addToList1() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
				list1.add(random.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void addToList2() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
				list2.add(random.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
