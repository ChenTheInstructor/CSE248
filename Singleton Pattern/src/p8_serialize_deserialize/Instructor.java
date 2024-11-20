package p8_serialize_deserialize;

import java.io.Serializable;

public class Instructor implements Serializable {
	private String name;
	private static Instructor instance = new Instructor("John");// loaded into memory b4 main starts
	// so it is thread-safe. there is no thread-safety issue

	private Instructor(String name) {
		this.name = name;
	}

	public static Instructor getInstance() {
		return instance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Object readResolve() {
		return instance;
	}
}
