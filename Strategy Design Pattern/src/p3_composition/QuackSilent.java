package p3_composition;

public class QuackSilent implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack silently...");
	}

}
