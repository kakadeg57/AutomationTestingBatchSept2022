package crmtests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
  LoginPage loginPage;
  
  @BeforeMethod
  public void initialization() {
	  
	  init();
	  loginPage = new LoginPage();
	  
  }
  @Test
  public void validateLoginPage() {
	  
	  loginPage.login();
  }
  @Test
	public void ValidateLogoTest() {
	  
	boolean status =loginPage.logoIsDisplyed();
	Assert.assertTrue(status);// it will expect always true value 
	}
  
  @Test
	public void ValidateForgotPasswordLinkRedirection() {
	  loginPage.forgotPassword();
	  
	 String attributeValue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).getAttribute("value");
	 
	 Assert.assertEquals(attributeValue, "Get Password");
  }
  
  
  
	@AfterMethod
	public void tearDown() {
		driver .close();

}
}
