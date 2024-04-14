package p2_old_api;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student("John", 1.0);
		
		StudentObserver dean = new StudentObserver("Dean's Office", student);
		StudentObserver parent = new StudentObserver("Parent", student);
		((Student)(student)).setGpa(4.0);
		
	}

}
