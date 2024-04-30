package p11_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainCallable {

	public static void main(String[] args) {
		Callable<Integer> c1 = () -> (int) (Math.random() * 100);

		Callable<Double> c2 = () -> {
			Thread.sleep(3000);
			return Math.random() * 100;
		};

		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(c1);
		Future<Double> f2 = es.submit(c2);
		Future<Integer> f3 = es.submit(c1);
		Future<Double> f4 = es.submit(c2);
		es.shutdown();

		try {

			Integer f1Value = f1.get();
			Double f2Value = f2.get();
			Integer f3Value = f3.get();
			Double f4Value = f4.get();
			Thread.sleep(10000);
			if (f1.isDone()) {
				System.out.println("f1Value: " + f1.get());
			}
//			System.out.println("f1Value: " + f1.get());
			System.out.println("f2Value: " + f2.get());
			System.out.println("f3Value: " + f3.get());
			System.out.println("f4Value: " + f4.get());

//			System.out.println("f3Value: " + f3Value);
//			System.out.println("f4Value: " + f4Value);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Done");
	}

}
