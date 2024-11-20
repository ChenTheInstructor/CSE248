package p2_modern;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student();
		
		StudentListener listener1 = new StudentListener();
		student.addPropertyChangeListener(listener1);
		
		StudentListener listener2 = new StudentListener();
		student.addPropertyChangeListener(listener2);
		
		student.setRecord(new Record("A", 1.5));
		
		System.out.println(listener1.getRecord());
		System.out.println(listener2.getRecord());
		
		student.removePropertyChangeListener(listener1);
		student.setRecord(new Record("B", 4.0));
		System.out.println(listener1.getRecord());
		System.out.println(listener2.getRecord());
		
	}

}
