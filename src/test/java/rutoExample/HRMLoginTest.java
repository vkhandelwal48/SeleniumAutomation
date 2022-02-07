package rutoExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HRMLoginTest {
	public static void main(String[] args) throws IOException {


		FileInputStream fis = new FileInputStream("C:\\Users\\Laptop\\eclipse-workspace\\com.org.coforge.webApplications\\data\\config.properties");

		Properties prop = new Properties();

		prop.load(fis);

		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));



		}


}
