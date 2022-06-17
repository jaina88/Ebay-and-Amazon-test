package com.qa.company.testNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTest {
	
	
	@Test
	public void aTest() {
		System.out.println("A test");
		
	}
	
	@Test(priority= -10, enabled = false)
	public void bTest() {
		System.out.println("B test");
	}
	
	
	@Test(priority= -1)
	public void cTets() {
		System.out.println("C test");
		
	}
	@Ignore
	@Test(priority=1)
	public void dTets() {
		System.out.println("D test");
	}
	
	
	@Test(priority=10)
	public void eTets() {
		System.out.println("E test");
	}
	
	@Test(priority=2)
	public void fTets() {
		System.out.println("F test");
		
}
	
}


