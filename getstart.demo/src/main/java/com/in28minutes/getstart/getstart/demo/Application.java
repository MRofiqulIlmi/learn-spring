package com.in28minutes.getstart.getstart.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	
	//need to answer about spring
	// what are the beans?
	// what are the dependencies of a bean?
	// where to search of beans? => on this time is doesnt need because the beans we need to search is inside of com.in28minutes.getstart.getstart.demo package
		//thats will already scanned based on the SpringBootApplication
	
	public static void main(String[] args) {
		
		//without application context also beans and dependencies
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		// using Application context will maintain all the beans
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		
		System.out.println(result);
		
		
	}

}
