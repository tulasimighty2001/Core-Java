package com.swaglabs.pomclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;

public class LoginPage extends BaseClass {
@FindBy(xpath="//input[@type='text']")private WebElement untxt;
@FindBy(xpath="//input[@type='password']")private WebElement pwdtxt;
@FindBy(xpath="//input[@type='submit']")private WebElement loginBtn;
public void LoginHome(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getUntxt() {
return untxt;
}
public WebElement getpwdtxt() {
return pwdtxt;
}
public WebElement getloginBtntxt() {
return loginBtn;
}
public void loginToApp(String un,String pwd) {
	untxt.sendKeys(un);
	pwdtxt.sendKeys(pwd);
	loginBtn.click();
}
}
