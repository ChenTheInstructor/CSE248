package p3_composition;

public class Car {
	private final Engine engine;
	private Person driver;
	
	public Car() {
		engine = new Engine();
	}
	
	public Car(Person person) {
		this.driver = person;
		this.engine = new Engine();
	}
}
