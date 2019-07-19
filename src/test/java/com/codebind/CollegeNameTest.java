package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollegeNameTest {

	
	@Test
	public void test() {
			
			App junit2 = new  App();
			String result = junit2.getCollegeName();
			assertEquals("UIC", result);
		} 

}
