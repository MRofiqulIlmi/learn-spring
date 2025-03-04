package com.in28minutes.getstart.getstart.demo;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
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
