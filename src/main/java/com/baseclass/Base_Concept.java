package com.baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
public class Base_Concept {												//  1 . 2	driver	//	maximize
	public static WebDriver driver;
		public static WebDriver getBrowser(String type) 
			{
				if (type.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Maven_1230\\chromedriver.exe");
						driver = new ChromeDriver();	}
				else if (type.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Maven_1230\\chromedriver.exe");
					driver = new FirefoxDriver();	}
						driver.manage().window().maximize();
			return driver;					
			}	
	public static void geturl(String url) {								//	3	getUrl
		driver.get(url);				
		}
	public static void close() {										//	4	close
		driver.close();					
		}
	public static void quittheBrowser() {								//	5	Quit
		try {
			driver.quit();
				} catch (Exception e) {
					e.printStackTrace();
						}
}
	public static void navigateTo(String url) {							//	6	To
		driver.navigate().to(url);		
		}
	public static void navigateBack() {									//	7	Back
		driver.navigate().back();		
		}
	public static void navigateForward() {								//	8	Forward
		driver.navigate().forward();	
		}
	public static void refresh() {										//	9	Refresh
		driver.navigate().refresh();	
		}
	public static void clickonElement(String string) {				//	10	Click
		string.click();	
		}
	public static void inputvalueElement(WebElement element, String value) {	//	11	findElements
		element.sendKeys(value);	
		}
	public static void getText(WebElement a) {									 //	12	GetText
		a.getText();	
		}
	public static void getAttribute(WebElement b, String c) {			//	13	GetAttribute
		b.getAttribute(c);	
		}
	public static void getOptions() {									//		14 . 15  . 16	GetOptions, 	GetTitle, 	GetCurrentUrl
		String d = driver.getTitle();
			System.out.println(d);
		String e = driver.getCurrentUrl();
			System.out.println(e);	
			}
	public static void dropDown(WebElement select) {					//		18.19.20		DropDown
		boolean f = select.isSelected();
			System.out.println(f);
		boolean g = select.isEnabled();
			System.out.println(g);
		boolean h = select.isDisplayed();
			System.out.println(h);	
			}
	public static void frame(WebElement i) {							// 21	Frame
		driver.switchTo().frame(i);		
	}
	public static void implicit(long j) {								//	22	Wait
		driver.manage().timeouts().implicitlyWait(j, TimeUnit.SECONDS);
	}
	public static void keyDown() throws AWTException {					//		23	Robot
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void keyEnter() throws AWTException {	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void actions(WebElement k, String l) {				//		24	Actions
		Actions act = new Actions (driver);
		if (l.equalsIgnoreCase("click")) {
			act.click(k).build().perform();
		}
		else if (l.equalsIgnoreCase("rightclick")) {
			act.contextClick(k).build().perform();
		}
		else if (l.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(k).build().perform();
		}
	}
	public static void alert(String m, String n) {						//		25	Alert
		Alert alt = driver.switchTo().alert();
			if (m.equalsIgnoreCase("accept")) {
				alt.accept();				
			}
			else if (m.equalsIgnoreCase("dismiss")) {
				alt.dismiss();				
			}
			else if (m.equalsIgnoreCase("sendkeys")) {
				alt.sendKeys(n);				
			}
			else if (m.equalsIgnoreCase("gettext")) {
				String text = alt.getText();
					System.out.println(text);
			}
	}
	public static void screen(String o) throws IOException {			//		26 screenshot
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File des = new File(o);
		FileHandler.copy(source, des);
	}
	public static void dropdown(WebElement element, String type, String text) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("type")) {
			s.selectByValue(type);
		}
			else if (text.equalsIgnoreCase("text")) {
				s.selectByVisibleText(text);				
			}
				  
				
	}          
}