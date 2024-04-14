package p3_enums;

public enum Singleton {
	INSTANCE(18, 0.0);
	
	private int age;
	private double gpa;
	
	Singleton(int age, double gpa) {
		this.age = age;
		this.gpa = gpa;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public double getGpa() {
		return gpa;
	}

	
}
