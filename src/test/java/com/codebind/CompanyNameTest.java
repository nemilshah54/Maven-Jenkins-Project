package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyNameTest {

	
	@Test
	public void test() {
			
			App junit2 = new  App();
			String result = junit2.getWorkCompany();
			assertEquals("CVS Health", result);
		} 

}
