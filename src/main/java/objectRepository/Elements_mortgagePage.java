package objectRepository;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;

public class Elements_mortgagePage 
{
	//public static By mortRates = By.xpath("//*[contains(text(),'Mortgage rates')]");
   public static By checkNationMort = By.xpath("//label[@id='selectorItemHaveNationwideMortgage1']");
   public static By mortType = By.id("selectorItemNationwideMortgageTypeNo0");
   public static By givePropValue = By.id("SearchPropertyValue");
   public static By giveDepositAmt = By.id("SearchDepositAmount");
   public static By selectMortTerm = By.id("SearchMortgageTerm");
   public static By findRateBtn = By.id("myButton");
   public static By mortTypeBtnfixedRate = By.xpath("//*[contains(text(),'Fixed rate')]");
   public static By prodFeeBtn = By.xpath("//*[contains(text(),'With fee')]");
   public static By mortTable = By.xpath("//*[@id = 'NewMortgageRateTables']");
   public static By mortTypeBtnTrackRate = By.xpath("//*[contains(text(),'Tracker rate')]");
   
   
}
