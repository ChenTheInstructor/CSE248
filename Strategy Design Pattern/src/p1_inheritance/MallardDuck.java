package p1_inheritance;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
	}

	public void fly() {
		System.out.println("Flying mallard duck...");
	}

	public void quack() {
		System.out.println("Quacking...");
	}

	@Override
	public void display() {
		System.out.println("Display mallard duck...");
	}

}
