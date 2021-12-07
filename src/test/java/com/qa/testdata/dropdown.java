package com.qa.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
        
        //static dropdown - select
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for(int i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        //dynamic dropdown with indexes
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
        driver.findElement(By.xpath("//a[@value='BLR']")).click(); ////*[@id="dropdownGroup1"]/div/ul[1]/li[8]/a
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
        
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(args);
      //input[@id='autosuggest']
	}
	

}
