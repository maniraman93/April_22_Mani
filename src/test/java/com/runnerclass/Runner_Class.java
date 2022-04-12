package com.runnerclass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class {
	public static void main(String[] args) throws Throwable 
	{
// LOGIN
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Maven_1230\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/index.php");
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("maniraman93");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("Dashram1*");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
// SELECTION OF ROOM	
	WebElement location = driver.findElement(By.name("location"));
	Select S1 = new Select(location);
	S1.selectByValue("Sydney");
	WebElement hotels = driver.findElement(By.name("hotels"));
	Select s2 = new Select(hotels);
	s2.selectByValue("Hotel Sunshine");
	WebElement roomtype = driver.findElement(By.name("room_type"));
	Select s3 = new Select(roomtype);
	s3.selectByValue("Super Deluxe");
	WebElement roomcount = driver.findElement(By.name("room_nos"));
	Select s4 = new Select(roomcount);
	s4.selectByValue("1");
	WebElement checkin = driver.findElement(By.name("datepick_in"));
	checkin.sendKeys("20/01/2022");
	WebElement checkout = driver.findElement(By.name("datepick_out"));
	checkout.sendKeys("22/01/2022");
	WebElement personcount = driver.findElement(By.name("adult_room"));
	Select s5 = new Select(personcount);
	s5.selectByValue("1");
	WebElement childcount = driver.findElement(By.name("child_room"));
	Select s6 = new Select(childcount);
	s6.selectByValue("0");
	WebElement search = driver.findElement(By.name("Submit"));
	search.click();
// CHECKING ROOM DETAILS	
	WebElement check = driver.findElement(By.name("radiobutton_0"));
	check.click();
	WebElement cont = driver.findElement(By.name("continue"));
	cont.click();
// GUEST DETAILS
	WebElement fn = driver.findElement(By.name("first_name"));
	fn.sendKeys("Mani");
	WebElement ln = driver.findElement(By.name("last_name"));
	ln.sendKeys("Raman");
	WebElement address = driver.findElement(By.name("address"));
	address.sendKeys("#4000, Warner Boulevard, California - 91522, US");
// PAYMENT
	WebElement card = driver.findElement(By.name("cc_num"));
	card.sendKeys("4321876598763210");
	WebElement cardtype = driver.findElement(By.name("cc_type"));
	Select s7 = new Select(cardtype);
	s7.selectByValue("VISA");
	WebElement cardmonth = driver.findElement(By.name("cc_exp_month"));
	Select s8 = new Select(cardmonth);
	s8.selectByValue("6");
	WebElement cardyear = driver.findElement(By.name("cc_exp_year"));
	Select s9 = new Select(cardyear);
	s9.selectByValue("2022");
	WebElement cvv = driver.findElement(By.name("cc_cvv"));
	cvv.sendKeys("987");
// BOOKING	
	WebElement book = driver.findElement(By.name("book_now"));
	book.click();
	Thread.sleep(5000);
// SCREENSHOT		
	TakesScreenshot snap = (TakesScreenshot) driver;
	File src = snap.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium1\\screenshot\\mainproject.png");
	FileUtils.copyFileToDirectory(src, des);		
		}
}