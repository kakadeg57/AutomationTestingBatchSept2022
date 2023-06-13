package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;
import utility.Util;

public class HomePage extends TestBase {
	
	// page factory > initElements
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		// web elements repository
		@FindBy (xpath = "//a[contains(text(),'Logout')]")
		WebElement logoutBtn;
		
		@FindBy (xpath = "//*[contains(text(),'User:')]")
		WebElement userLabel;
		
		@FindBy (xpath = "//*[@title='Companies']")                                   
		WebElement companies;
		@FindBy (linkText = "New Company")
		WebElement newCompanyLink;
		
		@FindBy(xpath = "//*[contains(text(),'Contacts')]")
		WebElement contacts;
		@FindBy(xpath = "//*[contains(text(),'New Contact')]")
		WebElement newContactLink;
		@FindBy(xpath = "//*[contains(text(),'Deals')]")
		WebElement deal;
		@FindBy(xpath = "//*[text()='New Deal']")
		WebElement newDealLink;
		@FindBy(xpath = "//*[contains(text(),'Tasks')]")
		WebElement task;
		@FindBy(xpath = "//*[contains(text(),'New Task')]")
		WebElement newTaskLink;
		@FindBy(xpath = "//a[@title='Reports']")	
		WebElement reports;
		
		
		
		// Action/methods
		
		public void logout() 
		{
			logoutBtn.click();
		}
		
		public boolean userName()
		{
			return  userLabel.isDisplayed();
		}

		public NewCompanyPage clickOnCreateCompany() 
		{	Util.switchToMainPanelFrame();
			Util.mouseHover(companies);
			newCompanyLink.click();
			return new NewCompanyPage();


}
		public NewContactPage clickOnNewContact() {
			Util.switchToMainPanelFrame();
			Util.mouseHover(contacts);
			newContactLink.click();
            return new NewContactPage();


}
		public void clickOnNewDeal() {
			Util.switchToMainPanelFrame();
			Util.mouseHover(deal);
			newDealLink.click();
			

			
		}
		public void clickOnNewTask() {
			Util.switchToMainPanelFrame();
			Util.mouseHover(task);
			newTaskLink.click();
			
			
		}
		
		public void clickOnReports() {
			Util.switchToMainPanelFrame();
			Util.ExplicitWait(reports, 25); // 50 imlicit + 25 explicit
			reports.click();
		}

}