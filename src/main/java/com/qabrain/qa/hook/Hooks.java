package com.qabrain.qa.hook;

import com.qabrain.qa.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void browserSetup() throws InterruptedException {
		BaseTest.init();
	}
	
	@After
	public void browserClose() {
		BaseTest.tearDown();
	}
}
