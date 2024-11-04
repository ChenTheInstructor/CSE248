package model;

public class StringBag {
	private String[] arr;
	private int nElems;
	private static StringBag instance;
	
	private StringBag(int maxSize) {
		arr = new String[maxSize];
		nElems = 0;
	}
	
	public static StringBag getInstance(int maxSize) {
		if(instance == null) {
			instance = new StringBag(maxSize);
		}
		return instance;
	}
	
	public void insert(String str) {
		arr[nElems++] = str;
	}
	
	public int getNelems() {
		return nElems;
	}
	
	public String get(int n) {
		return arr[n];
	}
}
