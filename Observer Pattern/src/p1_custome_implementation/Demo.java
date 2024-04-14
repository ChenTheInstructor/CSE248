package p1_custome_implementation;

public class Demo {

	public static void main(String[] args) {
		Observable student = new Student("John", 1.0);
		
		Observer dean = new StudentObserver("Dean's Office", student);
		Observer parent = new StudentObserver("Parent", student);
		((Student)(student)).setGpa(4.0);
		
	}

}
