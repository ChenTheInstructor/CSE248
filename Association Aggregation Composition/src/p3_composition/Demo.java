package p3_composition;

public class Demo {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1 = null;
		
		Person driver = new Person();
		Car car2 = new Car(driver);
		car2 = null;
	}

}
