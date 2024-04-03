package p1_eager;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private double gpa;

	// this implementation does not allow exception handling
	// One cannot user try-catch to surround the statement below
	private static final Student INSTANCE = new Student();
	

	private Student() {
	}

	private Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public static Student getInstance() {
		return INSTANCE;
	}

	public static Student getInstance(String name, double gpa) {
		INSTANCE.setName(name);
		INSTANCE.setGpa(gpa);
		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	
	public Object readResolve() {
		return INSTANCE;
	}

}
