package p1_custome_implementation;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
	private String name;
	private double gpa;
	private List<Observer> observerList;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		observerList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observerList.add(o);
		System.out.println("The observer is added.");
	}

	@Override
	public void unregister(Observer o) {
		observerList.remove(0);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observerList) {
			o.update(name, gpa);
		}
	}

}
