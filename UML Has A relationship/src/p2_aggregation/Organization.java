package p2_aggregation;

import java.util.LinkedList;
import java.util.List;

public class Organization {
	private LinkedList<Person> list;
	
	public Organization(List<Person> list) {
		this.list =(LinkedList) list;
		
	}
}
