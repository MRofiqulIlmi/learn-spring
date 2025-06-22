package com.in28minutes.getstart.getstart.demo.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

import com.in28minutes.getstart.getstart.demo.BasicApplication;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = BasicApplication.class)
public class SomeCdiBusinessSearchTest {

	// inject mock
	@InjectMocks
	SomeCdiBusiness business;

	// Create mock
	@Mock
	SomeCdiDao daoMock;

	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
		// when daoMock.getData called, it will return int[] {2,4}
		assertEquals(4, business.findGreatest());
	}

	@Test
	public void testBasicScenario_NoElement() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElement() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 2 });
		assertEquals(2, business.findGreatest());
	}

}
