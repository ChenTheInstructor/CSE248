package p4_decorator;

public class Espresso implements BeverageInt{
	private String description;
	private double cost;
	
	public Espresso(String description, double cost) {
		this.description = description;
		this.cost = cost;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getCost() {
		return cost;
	}

}
