package p2_aggregation;

import java.util.List;

public class Organization {
	private List<Person>  employees;
	
	public Organization(List<Person> list) {
		this.employees = list;
	}
	
	public void addAll(List<Person> list) {
		this.employees.addAll(list);
	}
}
