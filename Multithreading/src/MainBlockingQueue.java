import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainBlockingQueue {
//	private static BlockingQueue<Integer> q1 = new ArrayBlockingQueue(10);
	private static BlockingQueue<Integer> q1 = new LinkedBlockingQueue();
	
	public static void main(String[] args) {
		Thread t1 = new Thread( () -> {
			produce();
		});
		
		Thread t2 = new Thread( () -> {
			consume();
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
	
	public static void consume() {
		while(true) {
			try {
				Integer value1 = q1.take();
				Thread.sleep(2);
				System.out.print("Taken value: " + value1 + ", q1 size: ");
				System.out.println(q1.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void produce() {
		Random random = new Random();
		while(true) {
			try {
				q1.put(random.nextInt(100));
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
