package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void SubtractTest() {
		
		App junit = new  App();
		int result = junit.subtract(10, 5);
		assertEquals(5, result);
	}

}
