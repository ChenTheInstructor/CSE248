package p1_tradition;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John Doe", 3.5);
		StudentObserver o1 = new StudentObserver("A A", s1);
		StudentObserver o2 = new StudentObserver("B B", s1);
		s1.setName("Jane Doe");

		s1.deleteObserver(o1);
//		System.out.println("\n\n");

		System.out.println("\n\n");
		s1.setGpa(4.0);

	}

}
