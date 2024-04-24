package p2_interfaces;

public class Demo {

	public static void main(String[] args) {
		MallardDuck md1 = new MallardDuck();
		md1.fly();
		md1.quack();
		md1.display();
		
		RedheadDuck rh1 = new RedheadDuck();
		rh1.fly();
		rh1.quack();
		rh1.display();
		
		RubberDuckie rd1 = new RubberDuckie();
		rd1.quack();
		rd1.display();
		
	}

}
