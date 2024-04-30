package p4_volatile;

import java.util.Scanner;

public class App {
	private static volatile boolean flag = true;

	public static void main(String[] args) {
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				while (flag) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("hi");
//				}
//			}
//
//		});

		Thread t2 = new Thread(() -> {
			while (flag) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("hi");
			}
		});
		
		t2.start();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press ENTER to pause: ");
		scanner.nextLine();
		shutdown();
	}
	
	public static void shutdown() {
		flag = false;
	}

}
