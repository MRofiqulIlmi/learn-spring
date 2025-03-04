package com.in28minutes.getstart.getstart.demo;

//An interface in Java is a blueprint that defines methods but does not provide implementations. Classes that implement the interface must define those methods.
//interface is like a contract
//also interface can create default method that can be overwritten
//interface can provide public static final constant (cannot overwritten), also method (default or static)
public interface SortAlgorithm {
	public int[] sort(int[] numbers);
}
