package com.practice.app.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

import com.practice.app.App;


public class AppTest {
	
	App app;
	
	@BeforeTest
	public void init() {
		app = new App();
	}
	
	@Test(priority = 1)
	public void testMethod01() {
		assertEquals(app.method01(), "Hello World");
	}
	
	@Test(priority = 2)
	public void testMethod02() {
		assertEquals(app.method02(3, 4), 7);
	}
	
	@Test(priority = 3)
	public void testMethod03() {
		assertEquals(app.method03(3, 4)[0], "SUM: " + 7);
	}
	
}
