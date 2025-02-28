package p2_aggregation;

import java.util.LinkedList;
import java.util.List;

public class Organization {
	private List<Person> employees;
	
	public Organization() {
		employees = new LinkedList<>();
	}
	
	public void add(Person person) {
		employees.add(person);
	}
}
