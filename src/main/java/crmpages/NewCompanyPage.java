package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;

public class NewCompanyPage extends TestBase {
	
	//page factory
	public NewCompanyPage() {
      
	PageFactory.initElements(driver, this);
	
}
	
	
	//element repo
	@FindBy(id = "company_name")
	WebElement companyName;
	@FindBy(id="num_of_employees")
	WebElement numOfEmp;
	@FindBy(name = "address")
	WebElement address;
	@FindBy(name = "country")
	WebElement country;
	@FindBy(xpath ="(//input[@type='submit'])[2]")
	WebElement saveBtn;

	
	
	//Actions
	public void createCompany(String CompanyName, String empSize, String city, String Country) {
		companyName.sendKeys(CompanyName);
		numOfEmp.sendKeys(empSize);
		address.sendKeys(city);
		country.sendKeys(Country);
		saveBtn.click();
		
		
	}

}
