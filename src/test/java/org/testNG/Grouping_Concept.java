package org.testNG;

import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups = "Music")
	private void spotify() {
		System.out.println("Spotify");
	}
	
	@Test(groups = "Music")
	private void wynk() {
		System.out.println("Wynk");
	}
	
	@Test(groups = "Activity")
	private void sports() {
		System.out.println("Sports");
	}
	
	@Test(groups = "Shopping")
	private void Dressing() {
		System.out.println("Dresses");
	}
	
	@Test(groups = "Shopping")
	private void tshirt() {
		System.out.println("T-Shirt");
	}
}
