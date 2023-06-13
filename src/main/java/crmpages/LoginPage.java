package crmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import crmbase.TestBase;

public class LoginPage extends TestBase {

public LoginPage(){
	PageFactory.initElements(driver, this);
}
	
	// web elements repository
	
	@FindBy (name = "username")
	WebElement userName;
	@FindBy (name = "password")
	WebElement password;
	@FindBy(xpath = "//*[@value='Login']")
	WebElement loginBtn;
    @FindBy (linkText ="Forgot Password?")
    WebElement forgotpasswordLink;
    
    @FindBy(xpath = "(//*[@class='img-responsive'])[1]")
    WebElement logoImg;
    
     //actions/Methods
	
     public HomePage login() {
    	 
    	 userName.sendKeys("speedway2016");
    	 password.sendKeys("speedway@2016");
    	 loginBtn.click();
    	 
    	 return new HomePage();
	
}
     public void forgotPassword() {
    	 
    	 forgotpasswordLink.click();
    	 
     }
     public boolean logoIsDisplyed() { // it will return true value 
    	 boolean value = logoImg.isDisplayed();
    	
    	 return value;
     }

}