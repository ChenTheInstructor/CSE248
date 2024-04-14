package p1_custome_implementation;

public class StudentObserver implements Observer{
	private String observerName;
	
	public StudentObserver(String observerName, Observable observable) {
		this.observerName = observerName;
		
		observable.register(this);
		System.out.println("A observer " + observerName + " is added.");
	}

	@Override
	public void update(String name, double gpa) {
		System.out.println("The student observed changed to: " + name + ": " + gpa);
	}

}
