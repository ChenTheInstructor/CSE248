package p4_decorator;

public class Demo {

	public static void main(String[] args) {
		BeverageInt espresson = new Espresso("Espresso", 6.99);
		ToppingDecorator milk = new Milk(espresson);
		ToppingDecorator mocha = new Mocha(milk);
		System.out.println("The order: " + mocha.getDescription());
		System.out.println("The cost: " + mocha.getCost());
	}

}
