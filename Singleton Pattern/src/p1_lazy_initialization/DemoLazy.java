package p1_lazy_initialization;

public class DemoLazy {

	public static void main(String[] args) {
		// not thread-safe
		Instructor instructor1 = Instructor.getInstance("John");
		System.out.println(instructor1);
		Instructor instructor2 = Instructor.getInstance("Jane");
		System.out.println(instructor2);
	}

}
