package stepDefination;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_Assertions {
	String actual_response="201";
	@Test
	public void TC_01() {
		
		//Assert.assertTrue(false);
		Assert.assertEquals(200, actual_response);
		
	}

}
