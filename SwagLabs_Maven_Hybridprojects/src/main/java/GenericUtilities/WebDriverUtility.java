package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

public class WebDriverUtility {
public void maximizeBrowserWindow(WebDriver driver) {
	driver.manage().window().maximize();
	}

public void minimizeBrowserWindow(WebDriver driver) {
	driver.manage().window().minimize();
}

public void waitForpageload(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
}

public void handleDropDown(WebElement element,int index, String value) {
	Select s=new Select(element);
	s.selectByValue(value);	
}

public void VisibleText(WebDriver driver, WebElement element, String visibleText) {
	Select s=new Select(element);
	s.selectByVisibleText(visibleText);
}

public void doubleClick(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.doubleClick(element).perform();
}

public void dragAndDrop(WebDriver driver,WebElement element, WebElement srcelement, WebElement destelement) {
	Actions a=new Actions(driver);
	a.dragAndDrop(srcelement, destelement).perform();
}

public void getScreenShot(WebDriver driver,String sreenShotname) {
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\LENOVO\\Desktop\\"+sreenShotname+".png");
try {
	Files.copy(src,dest);
}

catch (IOException e){
	e.printStackTrace();
}
}
}