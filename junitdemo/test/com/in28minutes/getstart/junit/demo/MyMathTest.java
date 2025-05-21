package com.in28minutes.getstart.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();

	@Test
	void calculateSum_EmptyMemberArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
	}

	@Test
	void calculateSum_ThreeMemberArray() {
		// Absence of failure is success (green bar)
		// Test Condition or Assert
		int result = math.calculateSum(new int[] { 1, 2, 3 });
		int expectedResult = 6;
		assertEquals(expectedResult, result);
	}

}
