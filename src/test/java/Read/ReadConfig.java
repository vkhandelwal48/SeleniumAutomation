package Read;

import java.io.FileInputStream;



import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;



	public ReadConfig() throws IOException {



	FileInputStream fis = new FileInputStream("C:\\Users\\Laptop\\eclipse-workspace\\com.org.coforge.webApplications\\data\\config.properties");



	prop = new Properties();



	prop.load(fis);



	}



	public String appURL() {



	return prop.getProperty("URL");



	}



	public String adminUser() {



	return prop.getProperty("Username");



	}



	public String adminPassword() {



	return prop.getProperty("Password");



	}
}
