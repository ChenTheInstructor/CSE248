package p1_eager_static_block;

public class Student {
	private static Student instance;
	
	private Student() {}
	
	static {
		try {
			instance = new Student();
		} catch(Exception e) {
			throw new RuntimeException("Exception occurred in creating "
					+ "the singleton instance");
		}
	}
	
	public static Student getInstance() {
		return instance;
	}

}
