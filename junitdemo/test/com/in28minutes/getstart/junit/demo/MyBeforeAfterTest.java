package com.in28minutes.getstart.junit.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	static int num = 2;
	public int num2 = 2;
	private int num3 = 2;

	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}

	@BeforeEach
	void beforeEach() {
		num = 2;
		System.out.println("beforeEach");
	}

	@Test
	void test1() {
		num += 1;
		num2 += 1;
		num3 += 1;
		System.out.println("test1 " + num);
		System.out.println("test12 " + num2);
		System.out.println("test13 " + num3);
	}

	@Test
	void test2() {
		num += 1;
		num2 += 1;
		num3 += 1;
		System.out.println("test2 " + num);
		System.out.println("test22 " + num2);
		System.out.println("test23 " + num3);
	}

	@Test
	void test3() {
		num += 1;
		num2 += 1;
		num3 += 1;
		System.out.println("test3 " + num);
		System.out.println("test32 " + num2);
		System.out.println("test33 " + num3);
	}

	@AfterEach
	void afterEach() {
		System.out.println("afterEach");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}
}
