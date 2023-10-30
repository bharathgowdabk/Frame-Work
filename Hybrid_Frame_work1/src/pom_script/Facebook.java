package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_script.Base_page;

public class Facebook extends Base_page{
	@FindBy (id="email")
	private WebElement usn;
	@FindBy (id="pass")
	private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ok;
	
	public Facebook(WebDriver driver)
	{
		super(driver);
	}
	public void name()
	{
		usn.sendKeys("cool.bharath20@rediffmail.com");
		
	}
	public void field()
	{
		pwd.sendKeys("cqhpk5816r");
	}
	public void button()
	{
		ok.click();
	}

}
