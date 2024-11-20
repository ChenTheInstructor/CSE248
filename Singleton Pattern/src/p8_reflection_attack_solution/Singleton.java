package p8_reflection_attack_solution;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		if(instance != null) {
			System.out.println("An IllegalStateException is thrown.");
			throw new IllegalStateException("An instance already exists!");
		}
	}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
