package p3_composition;

public class Demo {

	public static void main(String[] args) {
//		MallardDuck md1 = new MallardDuck();
//		md1.setFlyBehavior(new FlyWithWings());
//		md1.setQuackBehavior(new Quack());
//		
////		RedheadDuck rh1 = new RedheadDuck();
////		rh1.setFlyBehavior(new FlyNoWay());
////		rh1.setQuackBehavior(new Quack());
//		
//		md1.getFlyBehavior().fly();
//		md1.getQuackBehavior().quack();
//		
//		System.out.println("\nChange behaivors: ");
//		md1.setFlyBehavior(new FlyNoWay());
//		md1.setQuackBehavior(new Squeak());
//		
//		md1.getFlyBehavior().fly();
//		md1.getQuackBehavior().quack();
//		
		
//		rh1.getFlyBehavior().fly();
//		rh1.getQuackBehavior().quack();
//		
//		RubberDuckie rd1 = new RubberDuckie();
//		rd1.setFlyBehavior(new FlyNoWay());
//		rd1.setQuackBehavior(new Squeak());
//		rd1.getFlyBehavior().fly();
//		rd1.getQuackBehavior().quack();
//		
		System.out.println("New duck species: ");
		NewDuckSpecies nds1 = new NewDuckSpecies();
		nds1.setFlyBehavior(new FlyWithFuel());
		nds1.setQuackBehavior(new QuackSilent());
		nds1.getFlyBehavior().fly();
		nds1.getQuackBehavior().quack();
	}

}
