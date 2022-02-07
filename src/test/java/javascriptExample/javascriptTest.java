package javascriptExample;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");

	}
	@AfterTest
	public void teardown() throws Exception {
	Thread.sleep(5000);
	driver.quit();

	}
	@Test
	public void dragdropTest() throws Exception {

	//driver.findElement(By.name("q")).sendKeys("iphone");

	//2 element - same property - default - perform on first element
	//Cancel button

	WebElement Return = driver.findElement(By.xpath("//strong[contains(text(),'Return within 30days')]"));
	// GoogleSearchbutton.click();

	//Multiple way to perform operation
	//driver.findElements(By.xpath("//input[@name='btnK']")).get(1).click();


	//Keyboard operation
	//driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);

	//JavaScript - any java scrit
	//Execute java script

	JavascriptExecutor JS = (JavascriptExecutor) driver;
	JS.executeScript("arguments[0].scrollIntoView();", Return);





	}
}
