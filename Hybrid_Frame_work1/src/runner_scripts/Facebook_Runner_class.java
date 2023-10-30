package runner_scripts;

import org.testng.annotations.Test;

import generic_script.Base_test;
import pom_script.Facebook;

public class Facebook_Runner_class extends Base_test {
	@Test
	public void disp()
	{
		Facebook fb=new Facebook(driver);
		fb.name();
		fb.field();
		fb.button();
	}
	

}
