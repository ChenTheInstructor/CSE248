package p1_eager;

public class Demo {

	public static void main(String[] args) {
		Student s1 = Student.getInstance();
		Student s2 = Student.getInstance("John", 1.5);
		System.out.println(s1 == s2);
	}

}
