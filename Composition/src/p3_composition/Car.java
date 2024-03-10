package p3_composition;

public class Car {
	private final Engine engine;
	private Person driver;
	
	public Car() {
		engine = new Engine();
	}
	
	public Car(Person driver) {
		this.driver = driver;
		this.engine = new Engine();
	}
}
