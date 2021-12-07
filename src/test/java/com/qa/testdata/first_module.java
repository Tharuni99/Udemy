package com.qa.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_module {

	public static void main(String[] args) throws InterruptedException {
		// Invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.youtube.com");
    //    System.out.println(driver.getTitle());
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(1000);

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys("hello123");

        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);//

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        }
	
	
	
	/*import java.time.Duration;



	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.edge.EdgeDriver;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.testng.Assert;





	public class Locators2 {



	public static void main(String[] args) throws InterruptedException {

	// TODO Auto-generated method stub

	String name = "rahul";

	System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

	WebDriver driver = new ChromeDriver();

	// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

	// WebDriver driver = new EdgeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	String password = getPassword(driver);

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.id("inputUsername")).sendKeys(name);

	driver.findElement(By.name("inputPassword")).sendKeys(password);

	driver.findElement(By.className("signInBtn")).click();

	Thread.sleep(2000);

	System.out.println(driver.findElement(By.tagName("p")).getText());

	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

	Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

	driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	driver.close();





	}

*/

	/*
	 * public static String getPassword(WebDriver driver) throws
	 * InterruptedException
	 * 
	 * 
	 * 
	 * {
	 * 
	 * driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 * 
	 * driver.findElement(By.linkText("Forgot your password?")).click();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	 * 
	 * String passwordText =driver.findElement(By.cssSelector("form p")).getText();
	 * 
	 * //Please use temporary password 'rahulshettyacademy' to Login.
	 * 
	 * String[] passwordArray = passwordText.split("'");
	 * 
	 * // String[] passwordArray2 = passwordArray[1].split("'");
	 * 
	 * // passwordArray2[0]
	 * 
	 * String password = passwordArray[1].split("'")[0];
	 * 
	 * return password;
	 * 
	 * //0th index - Please use temporary password
	 * 
	 * //1st index - rahulshettyacademy' to Login.
	 * 
	 * 
	 * 
	 * //0th index - rahulshettyacademy
	 * 
	 * //1st index - to Login.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Locators3 {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());









}



}





*****************************************************************

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class WindowActivities {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com");

driver.navigate().to("https://rahulshettyacademy.com");

driver.navigate().back();

driver.navigate().forward();

}



}




	 */












	}





        




		
		
		
	


