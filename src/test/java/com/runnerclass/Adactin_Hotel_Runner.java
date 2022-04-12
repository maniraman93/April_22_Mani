package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Concept;

public class Adactin_Hotel_Runner extends Base_Concept {
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = getBrowser("Chrome");
		geturl("http://automationpractice.com/index.php/");
		clickonElement(By.xpath("//a[@title='Log in to your customer account']"));
		
	}
	

}
