package testRunners;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;


public class baseTest {
//  @Test
//  public void f() {	
//  }
	 WebDriver driver;
	 String i=null;
	
	@Before()
	public void Chrome() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "/Users/kavyathandra/Workspace/Libs/chromedriver");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		System.out.println("Chrome is launched");  
  }

  
  
}
