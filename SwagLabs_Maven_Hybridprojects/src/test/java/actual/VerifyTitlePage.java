package actual;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyTitlePage extends BaseClass {
	@Test
	public void tc() {
		String expt="Swag Labs";
		String act=driver.getTitle(); 
		Assert.assertEquals(act,expt,"both are not equal");
		System.out.println("tc completed");
	}
}
