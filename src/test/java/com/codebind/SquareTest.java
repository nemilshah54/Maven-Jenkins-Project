package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void SquareTest() {
		
		App junit = new  App();
		int result = junit.square(4);
		assertEquals(16, result);
	}

}
