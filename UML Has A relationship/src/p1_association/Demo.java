package p1_association;

public class Demo {

	public static void main(String[] args) {
		
		Bank bank3 = new Bank(null);
		Asset asset1 = new Asset(bank3);
		Bank bank1 = new Bank(asset1);
		Bank bank2 = new Bank(asset1);
		Asset asset2 = new Asset(bank2);
		bank1= null;
		
	}

}
