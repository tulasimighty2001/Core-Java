package GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;
public class PropertyFileUtilityClass {
public FileInputStream fisp;
public String readDatafrompropertyFile(String key)throws Throwable{
fisp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SwagLabs_Maven_Hybridprojects\\src\\test\\resources\\swglabs.properties");
Properties p=new Properties();
p.load(fisp);
return p.getProperty(key);
}
	

}
