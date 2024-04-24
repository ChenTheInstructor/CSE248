package p4_decorator;

public class HouseBlend implements BeverageInt{
	private String description;
	private double cost;
	
	public HouseBlend(String description, double cost) {
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
