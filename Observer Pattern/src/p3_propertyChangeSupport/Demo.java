package p3_propertyChangeSupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
//		GPA gpa = new GPA(0.0);
//
//		// create and add listeners
//		GPAListener listener1 = new GPAListener();
//		gpa.addPropertyChangeListener(listener1);
//
//		GPAListener listener2 = new GPAListener();
//		gpa.addPropertyChangeListener(listener2);
//
//		// invoke a change of GPA
//		gpa.setGpa(1.0);
//		serialize(gpa);
		GPA gpa = deserialize();
		gpa.setGpa(2.0);
		System.out.println("Done!");

	}
	
	private static GPA deserialize() {
		try (FileInputStream fis = new FileInputStream("GPA.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			return (GPA)(ois.readObject());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void serialize(GPA gpa) {
		try (FileOutputStream fos = new FileOutputStream("GPA.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(gpa);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
