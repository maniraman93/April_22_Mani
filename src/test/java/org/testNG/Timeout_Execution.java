package org.testNG;

import org.testng.annotations.Test;

public class Timeout_Execution {

	@Test(timeOut = 7000)
	private void login() throws InterruptedException {
		Thread.sleep(2000);
		
		
	}
}
