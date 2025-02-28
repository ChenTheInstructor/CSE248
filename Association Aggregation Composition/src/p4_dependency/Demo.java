package p4_dependency;

public class Demo {

	public static void main(String[] args) {
		Die die = new Die();
		Gambler gambler = new Gambler();
		int n = gambler.gamble(die);
	}

}
