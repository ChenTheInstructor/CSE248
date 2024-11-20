package p6_enum_example;

public class Demo {

	public static void main(String[] args) {
		PersonBag bag1 = PersonBag.INSTANCE;
		System.out.println(bag1.getMaxSize());
		bag1.setMaxSize(500);
		System.out.println(bag1.getMaxSize());
		PersonBag bag2 = PersonBag.INSTANCE;
		System.out.println(bag2.getMaxSize());
		bag1.insert(new Person("A", 100));
		bag1.insert(new Person("B", 200));
		bag2.insert(new Person("aa", 1000));
		bag2.insert(new Person("bb", 2000));
		System.out.println("Bag 1:");
		bag1.showBag();
		System.out.println("Bag 2:");
		bag2.showBag();
		
	}

}
