package p5_enum_singleton_ser_deser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import p8_serialize_deserialize.Instructor;

public class DemoEnum {

	public static void main(String[] args) {
		System.out.println(Singleton.INSTANCE.getAge());
		System.out.println(Singleton.INSTANCE.getGpa());
		Singleton.INSTANCE.setAge(21);
		Singleton.INSTANCE.setGpa(4.0);
		
		// serialize the singleton object
				try {
					FileOutputStream out = new FileOutputStream("singletonSer.dat");
					ObjectOutputStream oos = new ObjectOutputStream(out);
					oos.writeObject(Singleton.INSTANCE);
					oos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("INSTANCE is backed up.");
				
				
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
//		System.out.println("Are the two instances the same: ");
//		System.out.println(Singleton.INSTANCE == INSTANCE2);
		System.out.println("Data in the original instance: ");
		System.out.println(Singleton.INSTANCE.getAge());
		System.out.println(Singleton.INSTANCE.getGpa());
		
		System.out.println("Data in the restored instance: ");
		System.out.println(INSTANCE2.getAge());
		System.out.println(INSTANCE2.getGpa());
		
	}

}
