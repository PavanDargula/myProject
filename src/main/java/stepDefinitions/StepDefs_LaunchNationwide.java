package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import expectedResults.expectedResults;
import objectrepository.Elements;
import org.openqa.selenium.WebElement;
import objectRepository.*;




public class StepDefs_LaunchNationwide {
	
	public static WebDriver driver;
	String baseurl = "https://www.nationwide.co.uk/";
	Elements_frontPage fp = new Elements_frontPage();
	Elements_mortgagePage mp = new Elements_mortgagePage();
	
	@Given("^Chrome Driver is launched$")
	public void chrome_Driver_is_launched() throws Throwable
			{
				System.setProperty("webdriver.chrome.driver", "/Users/kavyathandra/Workspace/Libs/chromedriver");	
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				
				System.out.println("Chrome is launched");    
			  //  throw new PendingException();
			}

	
	@Given("^Nationwide webaddress is given$")
	public void nationwide_webaddress_is_given() throws Throwable 
			{
				
				driver.get(baseurl);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
				Thread.sleep(3000);
				
			   
			}

	
	@Then("^Validate that nationwide webpage is launched$")
	public void validate_that_nationwide_webpage_is_launched() throws Throwable
			{
				System.out.println("Nationwide Webpage is launched");
			}

	
	@Given("^Mortgage Menu is selected$")
	public void mortgage_Menu_is_selected() throws Throwable 
			{
				WebElement Mortgages1 = driver.findElement(Elements.Mortgages);
				System.out.println("Mortgages menu is found");
				Actions action = new Actions(driver);
				action.moveToElement(Mortgages1).build().perform();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//*[contains(text(),'Mortgage rates')]")).click();	
				driver.findElement(fp.mortRates).click();;
			    System.out.println("Mortgage menu clicked");
				Boolean text = driver.getPageSource().contains("Search for a Nationwide mortgage");
				Assert.assertTrue(true);
				System.out.println("Word found" + text); 
			}

	@Then("^answer mortgage questionaaire to find the rates$")
	public void mortgage_Rates_are_selected() throws Throwable 
			{
			   // WebElement haveNationMort = driver.findElement(By.xpath("//label[@id='selectorItemHaveNationwideMortgage1']"));
		 		WebElement haveNationMort = driver.findElement(mp.checkNationMort);
				haveNationMort.click();
				System.out.println("Nationwide Mort Selected");
				//WebElement typeOfMort = driver.findElement(By.id("selectorItemNationwideMortgageTypeNo0"));
				WebElement typeOfMort = driver.findElement(mp.mortType);
				typeOfMort.click();
				System.out.println("Type of mortgage Selected");
				
				//WebElement propValue = driver.findElement(By.id("SearchPropertyValue"));
				WebElement propValue = driver.findElement(mp.givePropValue);
				propValue.sendKeys("200000");
				
				//WebElement depositAmount = driver.findElement(By.id("SearchDepositAmount"));
				WebElement depositAmount = driver.findElement(mp.giveDepositAmt);
				depositAmount.sendKeys("40000");
				
				//WebElement mortTerm = driver.findElement(By.id("SearchMortgageTerm"));
				WebElement mortTerm = driver.findElement(mp.selectMortTerm);
				mortTerm.sendKeys("30");
				
				//WebElement findRates = driver.findElement(By.id("myButton"));
				WebElement findRates = driver.findElement(mp.findRateBtn);
				findRates.click();
				
				Thread.sleep(5000);
			}
	
	@Given("^Mortgage type is fixed rate and product fee is yes$")
	public void mortgage_type_product_fee() throws Throwable 
			{
				//WebElement mortType=driver.findElement(By.xpath("//*[contains(text(),'Fixed rate')]"));
				WebElement mortType=driver.findElement(mp.mortTypeBtnfixedRate);
				mortType.click(); 
				
				Thread.sleep(5000);
		
				//WebElement prodFee=driver.findElement(By.xpath("//*[contains(text(),'With fee')]"));
				WebElement prodFee=driver.findElement(mp.prodFeeBtn);
				prodFee.click();
				
				Thread.sleep(5000);
			}

	
	@Then("^Verify the mortgage rates for fixed rate with product fee$")
	public void mortgage_rates_are_shown() throws Throwable 
			{
				//List<WebElement> rowA = driver.findElements(By.xpath("//*[@id = 'NewMortgageRateTables']/div/div/table/tbody"));
		
			
				expectedResults fr = new expectedResults();
				List<String> er = fr.expectedResult;
				 System.out.println("Expected results are: " + er);
				
		//		List<String> expectedResult = new ArrayList<String>();
		//		 
		//		 expectedResult.add("");
		//		 expectedResult.add("2 yr Fixed");
		//		 expectedResult.add("Monthly payment (excludes product fee)");
		//		 expectedResult.add("Initial rate");
		//		 expectedResult.add("Product fee");
		//		 expectedResult.add("Overall cost for comparison"); 
		//		 expectedResult.add("Total paid over 2 years (excludes product fee)"); 
		//		 expectedResult.add("More info and apply"); 
		//		 
		//		 expectedResult.add("");
		//		 expectedResult.add("3 yr Fixed");
		//		 expectedResult.add("Monthly payment (excludes product fee)");
		//		 expectedResult.add("Initial rate");
		//		 expectedResult.add("Product fee");
		//		 expectedResult.add("Overall cost for comparison"); 
		//		 expectedResult.add("Total paid over 3 years (excludes product fee)"); 
		//		 expectedResult.add("More info and apply"); 
		//		 
		//		 expectedResult.add("");
		//		 expectedResult.add("5 yr Fixed");
		//		 expectedResult.add("Monthly payment (excludes product fee)");
		//		 expectedResult.add("Initial rate");
		//		 expectedResult.add("Product fee");
		//		 expectedResult.add("Overall cost for comparison"); 
		//		 expectedResult.add("Total paid over 5 years (excludes product fee)"); 
		//		 expectedResult.add("More info and apply"); 
		//		 
		//		 expectedResult.add("");
		//		 expectedResult.add("10 yr Fixed");
		//		 expectedResult.add("Monthly payment (excludes product fee)");
		//		 expectedResult.add("Initial rate");
		//		 expectedResult.add("Product fee");
		//		 expectedResult.add("Overall cost for comparison"); 
		//		 expectedResult.add("Total paid over 10 years (excludes product fee)"); 
		//		 expectedResult.add("More info and apply"); 
		//		 
		//		 
		//		 
		//		 System.out.println("Expected results are: " + expectedResult);
		
				 List<String> actualResult = new ArrayList<String>();
					//WebElement table = driver.findElement(By.xpath("//*[@id = 'NewMortgageRateTables']")); 
					WebElement table = driver.findElement(mp.mortTable); 

				 List<WebElement> allCells = table.findElements(By.tagName("th"));
				 System.out.println("Cell Size" +allCells.size());
					 for (int j=0; j<allCells.size(); j++)
					 {
					     actualResult.add(allCells.get(j).getText());
					     
					 }
				 System.out.println("Actual Results " + actualResult);
				 
					 for(int i=0;i<er.size();i++) 
					 {
						    if(actualResult.get(i).contains(er.get(i))) {
						        System.out.println("Search function verified");
						    }else {
						        System.out.println("Search function verification failed"+actualResult.get(i));
						    }
					 }
				 
			}
	
	@Given("^Mortgage type is Tracker rate and product fee is yes$")
	public void mortgage_type_Tracker_Rate_product_fee() throws Throwable 
			{
				WebElement mortType=driver.findElement(mp.mortTypeBtnTrackRate);
				mortType.click(); 
				
				Thread.sleep(5000);
		
				WebElement prodFee=driver.findElement(mp.prodFeeBtn);
				prodFee.click();
				
				Thread.sleep(5000);
			}

	
	@Then("^Verify the mortgage rates for tracker rate with product fee$")
	public void mortgage_rates_for_tracker_are_shown() throws Throwable
			{
				 List<String> expectedResult = new ArrayList<String>();
				 expectedResult.add("");
				 expectedResult.add("2 yr Tracker");
				 expectedResult.add("Monthly payment (excludes product fee)");
				 expectedResult.add("Initial rate");
				 expectedResult.add("Product fee");
				 expectedResult.add("Overall cost for comparison"); 
				 expectedResult.add("Total paid over 2 years (excludes product fee)"); 
				 expectedResult.add("More info and apply"); 
				 
				 System.out.println("Expected results are: " + expectedResult);
		
				 List<String> actualResult = new ArrayList<String>();
					WebElement table = driver.findElement(By.xpath("//*[@id = 'NewMortgageRateTables']")); 
				 List<WebElement> allCells = table.findElements(By.tagName("th"));
				 System.out.println("Cell Size" +allCells.size());
						 for (int j=0; j<allCells.size(); j++)
						 		{
							 		actualResult.add(allCells.get(j).getText());
						 		}
				 System.out.println("Actual Results " + actualResult);
				 
						 for(int i=0;i<expectedResult.size();i++) 
								 {
									    if(actualResult.get(i).contains(expectedResult.get(i))) {
									        System.out.println("Search function verified");
									    }else
										    {
										        System.out.println("Search function verification failed"+actualResult.get(i));
										    }
								 }
				 
			}
	
}
				
		
		

		





