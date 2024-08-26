package com.swaglabs.pomclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass; 
public class HomePage extends BaseClass {
@FindBy(xpath="//div[.='Sauce Labs Backpack']")private WebElement e1;
@FindBy(xpath="//div[.='Sauce Labs Bolt T-Shirt']")private WebElement e2;
@FindBy(xpath="//div[.='Sauce Labs Fleece Jacket']")private WebElement e3;
@FindBy(xpath="//div[.='Sauce Labs Onesie']")private WebElement e4;
@FindBy(xpath="//div[.='Test.allTheThings() T-Shirt (Red)']")private WebElement e5;
	public HomePage(WebDriver wd) {
		PageFactory.initElements(wd,this);
		
	}
public WebElement getE1() {
	return e1;
}
public WebElement getE2() {
	return e2;
}
public WebElement getE3() {
	return e3;
}
public WebElement getE4() {
	return e4;
}
public WebElement getE5() {
	return e5;
}
public HomePage() {
e1.click();
e2.click();
e3.click();
e4.click();
e5.click();
	
}
}



