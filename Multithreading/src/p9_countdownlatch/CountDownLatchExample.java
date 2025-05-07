package p9_countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);  // 3 processors will count down
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 30; i++) {
            executor.submit(new Processor(latch));
        }

        System.out.println("Main thread waiting...");
        try {
            latch.await();  // Wait for all processors to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All processors finished. Main thread resumes.");

        executor.shutdown();
    }

}
