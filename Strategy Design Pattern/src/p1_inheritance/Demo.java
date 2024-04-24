package p1_inheritance;

public class Demo {

	public static void main(String[] args) {
		Duck md1 = new MallardDuck();
//		md1.fly();
//		md1.quack();
		md1.display();
		md1.performBehavior();
		
		Duck rh1 = new RedheadDuck();
//		rh1.fly();
//		rh1.quack();
		rh1.display();
		rh1.performBehavior();
		
		RubberDuckie rd1 = new RubberDuckie();
		rd1.display();
		rd1.performBehavior();
		
	}

}
