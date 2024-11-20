package p6_enum_example;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private double salary;
	public Person(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
