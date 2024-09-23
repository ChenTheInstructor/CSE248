package p3_composition;

public class Car {
	private final Engine engine;
	private Person driver;
	
	public Car(Person driver) {
		engine = new Engine();
		this.driver = driver;
	}
	
	public Car() {
		engine = new Engine();
	}
}
