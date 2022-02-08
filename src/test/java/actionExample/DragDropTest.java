package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTest {
	WebDriver driver;

	@BeforeTest
	public void launchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");


	}


	@AfterTest
	public void closeApp() throws Exception {
	Thread.sleep(3000);
	driver.close();

	}




	@Test
	public void dragdrop() throws Exception {



	WebElement dropFrame = driver.findElement(By.cssSelector(".demo-frame"));

	driver.switchTo().frame(dropFrame);


	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target = driver.findElement(By.cssSelector("div#droppable"));

	//Method1
	Actions act = new Actions(driver);
	//act.dragAndDrop(source, target).perform();


	//Method2
	act.clickAndHold(source).moveToElement(target).release().build().perform();



	}
}
