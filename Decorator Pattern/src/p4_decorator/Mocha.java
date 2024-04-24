package p4_decorator;

public class Mocha implements ToppingDecorator {
	private BeverageInt beverage;
	
	public Mocha(BeverageInt beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 1.99;
	}
	
	
}
