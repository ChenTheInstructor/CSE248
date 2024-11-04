package model;

public class StringBag {
	private String[] arr;
	private int nElems;
	
	public StringBag(int maxSize) {
		arr = new String[maxSize];
		nElems = 0;
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
