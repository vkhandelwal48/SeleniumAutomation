package com.org.coforge.webApplications;

//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven2 {
	@Test
	public void login() throws Exception {

	//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	// - version specific (compatibility issue)
	//browser : 97, driver:99
	//WebDriverManager - **
	//Download - https://jar-download.com/artifacts/io.github.bonigarcia/webdrivermanager/4.4.3/source-code

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");



	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("welcome")).click();



	Thread.sleep(3000);



	driver.findElement(By.linkText("Logout")).click();


	}



	}

