package com.learn.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataService dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);

		int result = businessImpl.findTheGreatestFromAllData();

		assertEquals(25, result);

	}

	@Test
	void findTheGreatestFromAllData_oneValueScenario() {
		DataService dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);

		int result = businessImpl.findTheGreatestFromAllData();

		assertEquals(35, result);

	}

}

//The problem of using STUB if we must to always update if the interface updated, and
//every you use the new scenario, you must need to add also the other one of new scenario
class DataServiceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 25, 15, 5 };
	}
}

class DataServiceStub2 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 35 };
	}
}