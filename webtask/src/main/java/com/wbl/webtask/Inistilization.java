package com.wbl.webtask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Inistilization {

	public static WebDriver driver;
    public static Properties prop;

    public  Inistilization() {
    	
    	try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/webtask/configure/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
    public static void BrowserInistilization() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanpuri\\Desktop\\driver\\chromedriver.exe");	
	driver = new ChromeDriver();
driver.get(prop.getProperty("pageurl"));

}
}
