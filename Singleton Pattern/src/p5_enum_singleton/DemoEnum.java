package p5_enum_singleton;

public class DemoEnum {

	public static void main(String[] args) {
		System.out.println(Singleton.INSTANCE.getAge());
		System.out.println(Singleton.INSTANCE.getGpa());
		Singleton.INSTANCE.setAge(21);
		Singleton.INSTANCE.setGpa(4.0);
		System.out.println(Singleton.INSTANCE.getAge());
		System.out.println(Singleton.INSTANCE.getGpa());
		
	}

}
