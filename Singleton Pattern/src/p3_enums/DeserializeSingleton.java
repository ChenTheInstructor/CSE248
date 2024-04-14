package p3_enums;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeSingleton {

	public static void main(String[] args) {
		Singleton singleton = null;
		
		try (FileInputStream fis = new FileInputStream("enum.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			singleton = (Singleton)ois.readObject();
			System.out.println("Age and GPA after deserialization: ");
			System.out.println(singleton.getAge());
			System.out.println(singleton.getGpa());
			
			singleton.setAge(100);
			singleton.setGpa(4.0);
			
			System.out.println("After using setters to restore values: ");
			System.out.println(singleton.getAge());
			System.out.println(singleton.getGpa());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(Singleton.INSTANCE == singleton) {
			System.out.println("The deserialized instance is the same as the Singleton.INSTANCE");
		} else {
			System.out.println("The deserialized instance is NOT the same as the Singleton.INSTANCE");
		}
	}

}
