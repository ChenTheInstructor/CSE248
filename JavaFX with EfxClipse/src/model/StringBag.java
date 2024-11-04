package model;

public class StringBag {
	private String[] theBag;
	private int nElems;
	private static StringBag instance;
	private int max_size;
	
	private StringBag(int max_size) {
		theBag = new String[max_size];
		nElems = 0;
		this.max_size = max_size;
	}
	
	public void insert(String str) {
		theBag[nElems++] = str;
	}
	
	public int getNelems() {
		return nElems;
	}
	
	public String get(int index) {
		return theBag[index];
	}
	
	public static StringBag getInstance(int max_size) {
		if(instance == null) {
			instance = new StringBag(max_size);
		}
		return instance;
	}
}
