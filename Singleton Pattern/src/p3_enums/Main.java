package p3_enums;

public class Main {

	public static void main(String[] args) {
		System.out.println(Singleton.INSTANCE.getAge());
		System.out.println(Singleton.INSTANCE.getGpa());
		
		Singleton.INSTANCE.setAge(20);
		Singleton.INSTANCE.setGpa(4.0);
		
		System.out.println(Singleton.INSTANCE.getAge());
		System.out.println(Singleton.INSTANCE.getGpa());
		
	}

}
