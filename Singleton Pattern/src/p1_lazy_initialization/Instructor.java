package p1_lazy_initialization;

public class Instructor {
	private String name;
	private static Instructor instance;

	private Instructor(String name) {
		this.name = name;
	}

	public static Instructor getInstance(String name) {
		if (instance == null) {
			instance = new Instructor(name);
		}

		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + "]";
	}

}
