package com.in28minutes.getstart.getstart.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.getstart.getstart.demo.basic.BinarySearchImpl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
@ComponentScan("com.in28minutes.getstart.getstart.demo.basic")
public class BasicApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// need to answer about spring
	// what are the beans?
	// what are the dependencies of a bean?
	// where to search of beans? => on this time is doesnt need because the beans we
	// need to search is inside of com.in28minutes.getstart.getstart.demo package
	// thats will already scanned based on the SpringBootApplication

	public static void main(String[] args) {

		// without application context also beans and dependencies
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// QuickSortAlgorithm());

		// using Application context will maintain all the beans

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);

			System.out.println(result);

		}
	}

	// as soon as the bean constructed, the postContruct will be called
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	// pre destroy is callback notification signal before the process being remove
	// by container
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}
