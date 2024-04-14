package p4_reflection_attack;

import java.lang.reflect.Constructor;

public class ReflectionAttack {

	public static void main(String[] args) {
		SimpleSingleton firstInstance = SimpleSingleton.getInstance();

		SimpleSingleton reflectionInstance = null;

		try {
			Constructor<SimpleSingleton> constructor = SimpleSingleton.class.getConstructor();
			constructor.setAccessible(true);
			reflectionInstance = constructor.newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("First instance: " + firstInstance);
		System.out.println("Reflection instance: " + reflectionInstance);
		
		System.out.println("Are they the same? " + (firstInstance == reflectionInstance));
	}
}
