package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
			
			App junit2 = new  App();
			int result = junit2.add(2,3);
			assertEquals(5, result);
		} 
	

}
