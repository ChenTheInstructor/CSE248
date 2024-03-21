package app;

public class Stock {
	private String symbol;
	private double shares;
	private double price;
	
	
	public Stock(String symbol, double shares, double price) {
		this.symbol = symbol;
		this.shares = shares;
		this.price = price;
	}


	public double getTotal() {
		return shares * price;
	}
	
}
