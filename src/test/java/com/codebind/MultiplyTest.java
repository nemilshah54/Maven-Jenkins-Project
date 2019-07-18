package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void MultiplyTest() {
		
		App junit = new App();
		int result = junit.multiply(4,2);
		assertEquals(8, result);
	}
}
