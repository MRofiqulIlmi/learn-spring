package com.in28minutes.getstart.getstart.demo;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		//1. super in Java refers to the parent class and is used to call its constructor or methods from a child class.
		//2. 'super()' must be first statement in constructor
		//3. If the parent class only has a constructor with parameters, Java does not automatically create a default constructor.
		//	In this case, you must explicitly call super(arguments) in the child constructor.
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//implement sort
		
	
			//for the hardcode call function like this
		// BubleSortAlgorithm bubbleSortAlgorithm = new BubleSortAlgorithm();
		
		//int [] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
			
			//for dynamic use algorithm
		
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//implement search
		
		return 3;
	}
}
