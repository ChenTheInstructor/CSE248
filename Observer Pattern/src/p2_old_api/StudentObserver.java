package p2_old_api;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer{
	private String observerName;
	
	public StudentObserver(String observerName, Observable student) {
		this.observerName = observerName;
		
		student.addObserver(this);
		System.out.println("A observer " + observerName + " is added.");
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("The student observed is: " + ((Student)o).getName());
		System.out.println("Whose's GPA is changed to: " + ((Student)o).getGpa());
	}


}
