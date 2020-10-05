package com.wbl.webtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBase extends Inistilization {
	public static WebDriver driver;

    @FindBy(xpath="//input[@type='number']") private WebElement  number;
    @FindBy(xpath="//button[@class='btn btn-primary mb-5 float-right mr-5 mt-2']")
	private WebElement login;

public TestBase(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void send(String password) {
	number.sendKeys(password);
}

public void loginButton() {
	login.click();
}



}
