package com.runnerclass;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Concept;
import com.pom.LogIn_Page;

public class Pom_RunnerClass extends Base_Concept 
{	
	public static WebDriver driver = Base_Concept.getBrowser("chrome");
	public static LogIn_Page lp = new LogIn_Page(driver);

	public static void main(String[] args) {
		geturl("http://adactinhotelapp.com/index.php");
		inputvalueElement(lp.getUsername(), "maneram93");
		inputvalueElement(lp.getPassword(), "manju19*");
		clickonElement(lp.getLogin());
		close();
	}
}
