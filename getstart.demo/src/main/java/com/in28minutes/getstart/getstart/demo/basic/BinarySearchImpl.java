package com.in28minutes.getstart.getstart.demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//component tell the spring is a beans
//by default the scope is singleton so when we called it always be same bean called back
//if using scope of prototype, when called twice, it will be difference instance, create twice, and have different hash code
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	// autowired tells the spring sortAlgorithm is a dependencies
	// if only these one without the setter below and the constuctor, is still the
	// setter
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	// private SortAlgorithm bubleSortAlgorithm;
	// autowiring also can use specific name of the class instead if have multi
	// component for sort
	// but primary still the winner of it if the one of it use primary
	// the other one is use the Qualifier, but the Qualifier need to make the name
	// also in several algorithm,
	// but this can use if the implemantation need several condition

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

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		// implement search

		return 3;
	}
}
