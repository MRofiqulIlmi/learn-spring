package com.in28minutes.getstart.getstart.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//component tell the spring is a beans
@Component
public class BinarySearchImpl {

	// autowired tells the spring sortAlgorithm is a dependencies
	// if only these one without the setter below and the constuctor, is still the
	// setter
	@Autowired
	private SortAlgorithm bubleSortAlgorithm;
	// private SortAlgorithm bubleSortAlgorithm;
	// autowiring also can use specific name of the class instead if have multi
	// component for sort
	// but primary still the winner of it if the one of it use primary

	// if using setter injection - if not provide, the context will not launch at
	// all, so basicly like mandatory also
	// basicly is same with constructor, but more less line only

	// @Autowired
	// public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	// this.sortAlgorithm = sortAlgorithm;
	// }

	// if using constructor injection
	// the best way is using constructor because can evade nullPointerExeption
	// because mandatory
	// public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
	// 1. super in Java refers to the parent class and is used to call its
	// constructor or methods from a child class.
	// 2. 'super()' must be first statement in constructor
	// 3. If the parent class only has a constructor with parameters, Java does not
	// automatically create a default constructor.
	// In this case, you must explicitly call super(arguments) in the child
	// constructor.
	// super();
	// this.sortAlgorithm = sortAlgorithm;
	// }

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// implement sort

		// for the hardcode call function like this
		// BubleSortAlgorithm bubbleSortAlgorithm = new BubleSortAlgorithm();

		// int [] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

		// for dynamic use algorithm

		int[] sortedNumbers = bubleSortAlgorithm.sort(numbers);
		System.out.println(bubleSortAlgorithm);

		// implement search

		return 3;
	}
}
