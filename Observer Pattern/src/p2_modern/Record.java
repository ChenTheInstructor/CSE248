package p2_modern;

public class Record {
	private String name;
	private double gpa;

	public Record(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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

	@Override
	public String toString() {
		return "Record [name=" + name + ", gpa=" + gpa + "]";
	}

}
