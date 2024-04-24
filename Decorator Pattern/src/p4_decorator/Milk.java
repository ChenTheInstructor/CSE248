package p4_decorator;

public class Milk implements ToppingDecorator{
	private BeverageInt beverage;

	public Milk(BeverageInt beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 0.99;
	}

}
