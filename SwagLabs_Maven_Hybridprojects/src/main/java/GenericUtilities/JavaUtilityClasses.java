package GenericUtilities;
import java.util.Random;
public class JavaUtilityClasses {
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(100);
		
	}

}
