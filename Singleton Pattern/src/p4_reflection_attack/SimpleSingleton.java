package p4_reflection_attack;

public class SimpleSingleton {
	private static SimpleSingleton instance;
	
	private SimpleSingleton() {
		if(instance != null) {
			throw new IllegalStateException("Instance already exisits!");
		}
	}
	
	public static synchronized SimpleSingleton getInstance() {
		if (instance == null) {
			instance = new SimpleSingleton();
		}
		return instance;
	}
}
