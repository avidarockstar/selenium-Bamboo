package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if(constant.BROWSER.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C://Users//avinash_k//Downloads//chromedriver_win32//chromedriver");
		driver=new ChromeDriver();
		}
		else {
			
			driver=new FirefoxDriver();
		}
		return driver;
	}

}
