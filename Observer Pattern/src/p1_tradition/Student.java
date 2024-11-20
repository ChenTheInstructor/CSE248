package p1_tradition;

import java.util.Observable;

public class Student extends Observable {
	private String name;
	private double gpa;
	
	

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers("Name Changed!");
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		setChanged();
		notifyObservers("GPA changed!");
	}

}
