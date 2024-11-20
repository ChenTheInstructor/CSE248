package p2_eager_initialization;

public class Demo {

	public static void main(String[] args) {
		Instructor instructor1 = Instructor.getInstance();
		System.out.println(instructor1.getName());
		instructor1.setName("Jane");
		System.out.println(instructor1.getName());
		Instructor instructor2 = Instructor.getInstance();
		System.out.println(instructor2.getName());
		System.out.println(instructor1 == instructor2);
	}

}
