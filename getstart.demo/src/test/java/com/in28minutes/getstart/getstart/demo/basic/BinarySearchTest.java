package com.in28minutes.getstart.getstart.demo.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.getstart.getstart.demo.BasicApplication;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicApplication.class)
public class BinarySearchTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		// call method
		int result = binarySearch.binarySearch(new int[] { 5 }, 5);
		// check the value correct
		assertEquals(5, result);

	}

}
