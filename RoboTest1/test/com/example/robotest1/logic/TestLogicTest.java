package com.example.robotest1.logic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestLogicTest {
	
	private TestLogic testLogic;

	@Before
	public void setUp() throws Exception {
		testLogic = new TestLogic();
	}

	@Test
	public void testPlus() {
		int expected = 3;
		int actual = testLogic.plus(1,  2);
		assertThat(actual, is(expected));
	}

}
