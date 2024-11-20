package p5_enum_singleton_ser_deser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialize {

	public static void main(String[] args) {
		// deserialize the singleton object
		Singleton INSTANCE2 = null;
		try {
			FileInputStream in = new FileInputStream("singletonSer.dat");
			ObjectInputStream ois = new ObjectInputStream(in);
			INSTANCE2 = (Singleton)(ois.readObject());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("INSTANCE2 is restored.");
		System.out.println("The data in the restored instance: ");
		System.out.println(INSTANCE2.getAge());
		System.out.println(INSTANCE2.getGpa());

	}

}
