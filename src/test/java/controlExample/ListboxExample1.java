package controlExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ListboxExample1 {
	WebDriver driver;

	@BeforeTest
	public void launchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");


	}


	@AfterTest
	public void closeApp() throws Exception {
	Thread.sleep(3000);
	driver.close();

	}




	//@Test
	public void handleList() throws Exception {

	//listbox
	WebElement listbox = driver.findElement(By.xpath("//select[@name='FromLB']"));

	//Select class
	Select list = new Select(listbox);

	//method from Select class
	//Listbox - index/visibletext/value
	//Indexing - start from 0

	System.out.println("Verify mutiple section enabled or not : "+list.isMultiple());
	Assert.assertTrue(list.isMultiple());

	list.selectByIndex(0); //USA
	list.selectByIndex(1); //Russia
	list.selectByIndex(5); //INdia

	list.selectByValue("Germany"); //Germany
	list.selectByVisibleText("Spain"); //Spain

	Thread.sleep(5000);
	//DeSelection
	list.deselectByIndex(0);
	list.deselectByValue("Germany");
	list.deselectByVisibleText("Spain");

	}

	@Test
	public void handleList2() throws Exception {



	WebElement lstbox_Car = driver.findElement(By.cssSelector("#Carlist"));

	//Select class
	Select list = new Select(lstbox_Car);

	System.out.println("Verify mutiple section enabled or not : "+list.isMultiple());
	Assert.assertFalse(list.isMultiple());

	list.selectByIndex(2); //Opel

	Thread.sleep(2000);

	list.selectByValue("Audi Car"); //Audi

	Thread.sleep(2000);

	list.selectByVisibleText("Toyota"); //Toyota



	}
}
