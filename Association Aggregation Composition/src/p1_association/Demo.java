package p1_association;

public class Demo {

	public static void main(String[] args) {
		Asset asset = new Asset();
		Bank bank = new Bank(asset);
		bank = null;
	}

}
