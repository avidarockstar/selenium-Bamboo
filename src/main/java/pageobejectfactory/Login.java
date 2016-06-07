package pageobejectfactory;

import genericlib.constant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	
	@FindBy(name="txtUsername")
	WebElement usernameedit;
	
	@FindBy(name="txtPassword")
	WebElement passwordedit;
	
	@FindBy(name="Submit")
	WebElement loginbutton;
	
	public void logintoApp(){
		
		usernameedit.sendKeys(constant.USERNAME);
		passwordedit.sendKeys(constant.PASSWORD);
		loginbutton.click();
	}

}
