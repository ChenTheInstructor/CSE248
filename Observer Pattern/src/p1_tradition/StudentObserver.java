package p1_tradition;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer {
	private String name;
	private Student student;
	
	public StudentObserver(String name, Student student) {
		this.name = name;
		this.student = student;
		student.addObserver(this);
		System.out.println("Added a new observer: " + name +" to the observable.");
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("The observer is: " + name + ".\n The student observed is: " + ((Student)o).getName() 
				+ ", " + ((Student)o).getGpa() + ".");
		System.out.println(arg);
	}

}
