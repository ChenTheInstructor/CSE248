package p2_interfaces;

public class RubberDuckie extends Duck implements Quackable{

//	@Override
//	public void fly() {
//		System.out.println("Don't use the fly method. I cannot fly.");
//	}

	@Override
	public void quack() {
		System.out.println("Squeak...");
	}

	@Override
	public void display() {
		System.out.println("Display rubber duckie..");
	}

}
