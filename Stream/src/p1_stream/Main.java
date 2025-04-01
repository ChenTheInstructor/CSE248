package p1_stream;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.0);
		Student s2 = new Student("Z", 4.0);
		Student s3 = new Student("M", 3.6);
		Student s4 = new Student("Q", 1.0);
		Student s5 = new Student("A", 4.0);
		
		HashSet<Student> hashSet = new HashSet<>(10);
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		hashSet.add(s4);
		hashSet.add(s5);
//		
//		for(Student s : hashSet) {
//			System.out.println(s);
//		}
		
	List<Student> list = hashSet.stream()
			.filter((s) -> s.getName().compareTo("M") >= 0 && s.getGpa() >= 3.5)
			.collect(Collectors.toList());
	
	for(Student s : list) {
		System.out.println(s);
	}
	}

}
