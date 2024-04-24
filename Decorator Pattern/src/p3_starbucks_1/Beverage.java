package p3_starbucks_1;

public class Beverage {
	private String description;
	private double cost;
	
	private String milk;
	private String mocha;
	private double milk_price;
	private double mocha_price;

	public Beverage(String description, double cost) {
		super();
		this.description = description;
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Beverage [description=" + description + ", cost=" + cost + "]";
	}

}
