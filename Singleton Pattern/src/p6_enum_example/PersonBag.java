package p6_enum_example;

import java.io.Serializable;

public enum PersonBag implements Serializable{
	INSTANCE(1000);
	private int maxSize;
	private Person[] arr;
	private int nElems;
	
	PersonBag(int maxSize) {
		this.arr = new Person[maxSize];
		this.maxSize = maxSize;
	}
	
	public void insert(Person person) {
		arr[nElems++] = person;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public void showBag() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public void setNelems(int nElems) {
		this.nElems = nElems;
	}
	
	public int getNelems() {
		return nElems;
	}
 }
