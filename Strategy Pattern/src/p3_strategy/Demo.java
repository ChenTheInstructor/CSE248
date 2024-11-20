package p3_strategy;

public class Demo {

	public static void main(String[] args) {
		FlyBehavior flyBehavior1 = new FlyFast();
		FlyBehavior flyBehavior2 = new FlySlow();
		
		QuackBehavior quackBehavior1 = new Quack();
		QuackBehavior quackBehavior2 = new Squeak();
		
		RedheadDuck rh1 = new RedheadDuck();
		rh1.setFlyBehavior(flyBehavior1);
		rh1.setQuackBehavior(quackBehavior1);
		
		rh1.performFly();
		rh1.performQuack();
		
		rh1.setFlyBehavior(flyBehavior2);
		rh1.setQuackBehavior(quackBehavior2);
		rh1.performFly();
		rh1.performQuack();
	}

}
