package org.testNG;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("Set Property");
	}
	@Test
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@Test(invocationCount = 3, priority = 1)
	private void refresh() {
		System.out.println("Refresh");
	}
	
}
