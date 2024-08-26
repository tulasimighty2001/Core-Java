package hybridFW_swaglabs_pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@id='user-name']")private WebElement untxt;
@FindBy(xpath="//input[@id='user-name']")private WebElement pwdtxt;
@FindBy(xpath="//input[@id='user-name']")private WebElement loginBtn;
public void LoginHome(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getUntxt() {
return untxt;}
public WebElement getpwdtxt() {
return pwdtxt;}
public WebElement getloginBtntxt() {
return loginBtn;}
public void loginToApp(String un,String pwd) {
	untxt.sendKeys(un);
	pwdtxt.sendKeys(pwd);
	loginBtn.click();
}
}