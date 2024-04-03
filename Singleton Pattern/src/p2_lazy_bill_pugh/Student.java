package p2_lazy_bill_pugh;

public class Student {
	private Student() {}
	
	private static class SingletonHelper {
		private static final Student INSTANCE = new Student();
	}
	
	public Student getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
