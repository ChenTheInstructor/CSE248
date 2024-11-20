package p8_reflection_attack_solution;

import java.lang.reflect.Constructor;

public class Demo {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		
		Singleton reflectionInstance = null;
		
		try {
			Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true); // bypass the private access modifier
			reflectionInstance = constructor.newInstance();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(s1);
		System.out.println(reflectionInstance);
		System.out.println(s1 == reflectionInstance);
	}

}
