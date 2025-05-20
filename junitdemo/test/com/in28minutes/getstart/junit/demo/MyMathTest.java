package com.in28minutes.getstart.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		// Absence of failure is success (green bar)
		// Test Condition or Assert

		MyMath math = new MyMath();

		int[] numbers = { 1, 2, 3 };

		int result = math.calculateSum(numbers);
		System.out.println(result);

		int expectedResult = 6;

		assertEquals(expectedResult, result);

	}

}
