package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Concept;

public class Demo_Baseclass_Concept extends Base_Concept {
		public static WebDriver driver;
		public static void main(String[] args) throws IOException {		driver = getBrowser("chrome");
		geturl("https://adactinhotelapp.com/index.php");
	//	navigateTo("https://www.facebook.com/");
		screen("C:\\Users\\HP\\eclipse-workspace\\Selenium1\\screenshot//fb1.png");
		
		
		
	}
	
	

}
