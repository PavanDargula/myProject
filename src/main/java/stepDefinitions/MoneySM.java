package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.runtime.Utils;

public class MoneySM {
	
	public static void main (String[] args ) throws InterruptedException {
		
		WebDriver driver = null;
		String url = "https://www.expedia.co.uk/";
		System.setProperty("webdriver.chrome.driver", "/Users/kavyathandra/Workspace/Libs/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		//driver.manage().window().maximize();
	//	driver.manage().window().wait(10, Seconds);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[@href=\"https://www.moneysavingexpert.com/borrowing/\" and @class=\"cards\"][1]"))).build().perform();
//		System.out.println("Link clicked");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[contains(text(),'0% Credit Cards for Spending')]")).click();
//		Boolean pagesource = driver.getPageSource().contains("Page SourceBest 0% credit cards: interest free for 28 mths");
//		System.out.println("Page Source" +pagesource);
//		//String er="Page SourceBest 0% credit cards: interest free for 28 mths";
//		Assert.assertTrue(true);
//		System.out.println("Page FOund");
		//Select pClass = new Select(element);
//		driver.findElement(By.xpath("//input[@data-hotel_id_element=\"package-origin-hp-package-hotel_id\"]")).sendKeys("London");
//		driver.findElement(By.xpath("//input[@data-lat_long_element=\"package-destination-hp-package-lat_long\"]")).sendKeys("Hyderabad");
//		WebElement dd = driver.findElement(By.id("package-departing-hp-package"));
//		//dd.sendKeys("10/09/2019");
//		dd.sendKeys(Keys.TAB);
//		dd.sendKeys("10/09/2019");
//		Actions action= new Actions(driver);
//		//action.sendKeys(Keys.ESCAPE);
//		Thread.sleep(100);
//		driver.findElements(By.xpath("//button[@class=\"datepicker-close-btn close btn-text\"]")).clear();	
//		System.out.println("calendar close");
//		Thread.sleep(100);
//		driver.findElement(By.id("package-returning-hp-package")).sendKeys("11/10/2019");
//		
//		
//		
//		Select pClass = new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package")));
//		
//	//	Select pClass = Select(driver.findElements(By.id("package-advanced-preferred-class-hp-package")));
//		pClass.selectByVisibleText("First class");
//		
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		WebElement link = null ;
//		wait.until(ExpectedConditions.visibilityOf(element))
		
		
	}

	 
	}


