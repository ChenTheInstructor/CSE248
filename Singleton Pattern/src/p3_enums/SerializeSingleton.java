package p3_enums;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.INSTANCE;
		System.out.println(singleton.getAge());
		System.out.println(singleton.getGpa());
		singleton.setAge(20);
		singleton.setGpa(4.0);

		System.out.println(singleton.getAge());
		System.out.println(singleton.getGpa());

		try (FileOutputStream fos = new FileOutputStream("enum.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(singleton);
//			oos.close();
			System.out.println("The enum is serialized.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			StackTraceElement[] arr = e.getStackTrace();
			for(StackTraceElement a : arr) {
				System.out.println(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
