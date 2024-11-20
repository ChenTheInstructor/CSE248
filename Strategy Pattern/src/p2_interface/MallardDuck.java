package p2_interface;

public class MallardDuck implements Quackable, Flyable {

	@Override
	public void fly() {
		System.out.println("It flys slowly!");
	}

	@Override
	public void quack() {
		System.out.println("It quacks like a big duck.");
	}

}
