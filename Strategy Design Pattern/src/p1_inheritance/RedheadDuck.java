package p1_inheritance;

public class RedheadDuck extends Duck {

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
