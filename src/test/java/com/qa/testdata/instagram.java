package com.qa.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        //URL in the browser
        
       // driver.findElement( By.xpath("//input[@type='text']")).sendKeys("tharuni_sar");
       // driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("abcde");
       // driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
     
        driver.findElement(By.name("username")).sendKeys("xyz");
        driver.findElement(By.name("password")).sendKeys("abcd456789");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();

	}

}
