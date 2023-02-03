package com.itfac.qautomation1.qautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuireValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://quire.io/");
		
		
		System.out.println(driver.getTitle());
		
		String expectedTitle="Quire - Unfold Your Ideas";
		String actualTitle=driver.getTitle();
		
		driver.findElement(By.linkText("GET STARTED - It's FREE!")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://quire.io/signup"));
		
		String actualTitle1=driver.getTitle();
		String expectedTitle1="Quire Sign up";
		
		driver.findElement(By.linkText("LOG IN")).click();
		
		
		driver.findElement(By.id("s_username")).sendKeys("lakshani@gmail.com");
		driver.findElement(By.id("s_password")).sendKeys("Chathu97#");
		driver.findElement(By.cssSelector("button.signin-button")).click();
		
		WebDriverWait wait2= new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-header")));
		
		String actualTitle2=driver.getTitle();
		String expectedTitle2="Quire Log in";
	
		
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Pass");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
		if(expectedTitle1.equals(actualTitle1)) {
			System.out.println("Test Pass");
		}
		
		else {
			System.out.println("Test Failed");
		}
		

		if(expectedTitle2.equals(actualTitle2)) {
			System.out.println("Test Pass");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
	}

}
