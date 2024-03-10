package p1_association;

public class Asset {
	private Bank bank;
	private double cash;
	
	public Asset(Bank bank, double cash) {
		this.bank = bank;
		this.cash =  cash;
	}
	
}
