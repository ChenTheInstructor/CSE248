package p2_interfaces;

public class RedheadDuck extends Duck implements Flyable, Quackable{

	@Override
	public void fly() {
		System.out.println("Fly redhead duck...");
	}

	@Override
	public void quack() {
		System.out.println("Quacking ...");
	}

	@Override
	public void display() {
		System.out.println("Displaying redhead duck...");
	}

}
