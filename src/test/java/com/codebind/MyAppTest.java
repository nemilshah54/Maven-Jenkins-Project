package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyAppTest {

	@Test
	public void test() {
		
		App junit = new  App();
		
		String result = junit.nameOfTest();	
		assertEquals("Mathematical Calculations", result);
	}

}
