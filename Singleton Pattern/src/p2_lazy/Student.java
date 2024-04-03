package p2_lazy;

public class Student {
	private String name;
	private double gpa;
	private static Student instance;
	private static Object ob = new Object();

	private Student() {
	}

	private Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public static Student getInstance() {

		if (instance == null) {
			synchronized (ob) {
				instance = new Student();
			}

		}
		return instance;
	}

	public static Student getInstance(String name, double gpa) {

		if (instance == null) {
			synchronized (ob) {
				instance = new Student(name, gpa);
			}
		} else {
			instance.setName(name);
			instance.setGpa(gpa);
		}

		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Object readResolve() {
		return instance;
	}

}
