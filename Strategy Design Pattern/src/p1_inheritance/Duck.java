package p1_inheritance;

public abstract class Duck {
	public Duck() {
	}
	
	public abstract void fly();
	
	public abstract void quack();
	
	public void performBehavior() {
		fly();
		quack();
	}
	
	public abstract void display();
}
