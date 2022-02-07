package javascriptExample;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollIntoView {
	WebDriver driver;

	@BeforeTest
	public void launchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");


	}


	@AfterTest
	public void closeApp() throws Exception {
	Thread.sleep(3000);
	//driver.close();

	}




	@Test
	public void contextClick() throws Exception {




	// WebDriverWait wait = new WebDriverWait(driver, 15);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Explore games')]")));
	//
	//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
	Thread.sleep(4000);
	//WebElement button = driver.findElement(By.cssSelector("#nav-search-submit-button"));
	WebElement Explore_games = driver.findElement(By.xpath("//h2[contains(text(),'Explore games')]"));
	//WebElement AboutUS = driver.findElement(By.linkText("About Us"));
	//WebElement todayDeal = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));

	// JavascriptExecutor JS = (JavascriptExecutor)driver;
	// //JS.executeScript("arguments[0].click();",button);
	//
	// JS.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//h2[contains(text(),'Explore games')]")));
	//
	JavascriptExecutor JS = (JavascriptExecutor) driver;
	JS.executeScript("arguments[0].scrollIntoView();", Explore_games);


	}

}
