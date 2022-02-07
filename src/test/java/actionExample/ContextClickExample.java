package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickExample {
	WebDriver driver;

	@BeforeTest
	public void launchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");


	}


	@AfterTest
	public void closeApp() throws Exception {
	Thread.sleep(3000);
	driver.close();

	}




	@Test
	public void contextClick() throws Exception {



	WebElement btnRight = driver.findElement(By.xpath("//span[text()='right click me']"));


	//Right Click - COntext Click
	Actions act = new Actions(driver);
	act.contextClick(btnRight).perform();


	WebElement btnDelete = driver.findElement(By.xpath("//span[text()='Delete']"));
	btnDelete.click();

	//Handle Alert
	String alertText = driver.switchTo().alert().getText();
	Assert.assertEquals(alertText, "clicked: delete");
	driver.switchTo().alert().accept();
driver.switchTo().alert().accept();
	}
}
