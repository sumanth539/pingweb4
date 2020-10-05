package test;

import java.util.logging.Logger;

import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.webtask.Inistilization;
import com.wbl.webtask.TestBase;

public class WebLogin extends Inistilization {

	TestBase t;
	Inistilization i;

	@Before
	public void loginPage() {

		i = new Inistilization();
		BrowserInistilization();

	}

	@Test
	public void ValidCredientials() {
		t.send("8523088073");
		t.loginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void InValidCredientials2() {
		t.send("1236547896");
		t.loginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");

	}

	@Test
	public void NullCredientials() {

		try {
			TestBase t = new TestBase(driver);
			t.send(null);
			t.loginButton();
			Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");

		} catch (Exception e) {

		}

	}

	@Test
	public void IntCharCreiantials() {
		t.send("789abc2312");
		t.loginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");

	}

	@Test
	public void Fractions() {
		t.send("998984.99");
		t.loginButton();

		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void NumberSPecialCaracters() {
		t.send("8523496325-");
		t.loginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void EmptyCredientials() {
		t.send("  ");
		t.loginButton();

		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void SpacedCredientials() {
		t.send("85234  96325");
		t.loginButton();

		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

}
