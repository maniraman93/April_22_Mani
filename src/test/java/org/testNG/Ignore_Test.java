package org.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;


public class Ignore_Test {

	
	@Ignore
	@Test
	private void women() {
		System.out.println("women");
	}
	@Test(enabled = false)
	private void men() {
		System.out.println("men");
	}
	@Test
	private void dresses() {
		System.out.println("dresses");
	}
	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}
}

