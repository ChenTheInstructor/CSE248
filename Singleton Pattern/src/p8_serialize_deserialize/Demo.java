package p8_serialize_deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args)  {
		Instructor instructor1 = Instructor.getInstance();
		System.out.println(instructor1.getName());
		instructor1.setName("Jane");
		System.out.println(instructor1.getName());
		
		// serialize the singleton object
		try {
			FileOutputStream out = new FileOutputStream("singletonSer.dat");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(instructor1);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Instructor 1 is backed up.");
		
		
		// deserialize the singleton object
		Instructor instructor3 = null;
		try {
			FileInputStream in = new FileInputStream("singletonSer.dat");
			ObjectInputStream ois = new ObjectInputStream(in);
			instructor3 = (Instructor)(ois.readObject());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Instructor 3 is restored.");
		
		
		
		
//		Instructor instructor2 = Instructor.getInstance();
//		System.out.println(instructor2.getName());
		System.out.println(instructor1 == instructor3);
	}

}
