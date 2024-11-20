package p3_billPugh;

public class Instructor {
	private String name;
	
//	public Instructor() {
//		
//	}
	private Instructor(String name) {
		this.name = name;
	}
	
	private static class SingleHelper {
		private static final Instructor instance = new Instructor("John");
	}
	
	public static Instructor getInstance() {
		return SingleHelper.instance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
