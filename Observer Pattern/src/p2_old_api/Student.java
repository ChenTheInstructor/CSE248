package p2_old_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Student extends Observable {
	private String name;
	private double gpa;
	

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers("Name changed to:" + name);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		setChanged();
		notifyObservers("GPA changed to:" + gpa);
	}

	
	

}
