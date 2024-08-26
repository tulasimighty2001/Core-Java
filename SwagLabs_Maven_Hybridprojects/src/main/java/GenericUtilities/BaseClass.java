package GenericUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.swaglabs.pomclasses.LoginPage;

public class BaseClass {
public PropertyFileUtilityClass pu=new PropertyFileUtilityClass();
public EXcelFileUtility eu=new EXcelFileUtility();
public JavaUtilityClasses ju=new JavaUtilityClasses();
public WebDriverUtility wu=new WebDriverUtility();
public WebDriver driver=null;

@BeforeSuite
public void bsconfig() {
System.out.println("===DB CONNECTION===");
}
@AfterSuite
public void asconfig() {
	System.out.println("===DB DISCONNECTION===");
}
@BeforeClass
public void bconfig() throws Throwable{
	String BROWSER =pu.readDatafrompropertyFile("browser");
	String URL=pu.readDatafrompropertyFile("url");
	if(BROWSER.equalsIgnoreCase("edge")) {
		driver =new EdgeDriver();
		System.out.println("Edge driver is Launched");
	}
	else if(BROWSER.equalsIgnoreCase("chrome")){
		driver=new ChromeDriver();
		System.out.println("chrome driver is Launched");
	}
	
	else
	{
		System.out.println("Invalid broser name");
		
	}
	driver.get(URL);
	wu.maximizeBrowserWindow(driver);
	wu.waitForpageload(driver);
	wu.getScreenShot(driver, "login");
}


@AfterClass
public void terDown(){
	driver.quit();
}
@BeforeMethod
public void bmconfig()throws Throwable{
	String UN=pu.readDatafrompropertyFile("un");
	String PWD=pu.readDatafrompropertyFile("pwd");
	LoginPage Ip=new LoginPage();
	Ip.loginToApp(UN,PWD);
	wu.getScreenShot(driver,"home");
}
@AfterMethod
public void amconfig() {
	System.out.println("Logout from App");
}
}

