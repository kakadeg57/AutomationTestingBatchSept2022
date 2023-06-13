package crmtests;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import utility.Util;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Util utl;

	@BeforeMethod
	public void initialization()
	{
		init();
		loginPage = new LoginPage();
		loginPage.login();
		homePage = new HomePage();
		utl = new Util();
		
	}
//	@Ignore
	@Test
	public void validateLogoutTest() // pre-requisite 
	{
		homePage.logout();
		Assert.assertTrue(loginPage.logoIsDisplyed());;
		
	}
//	@Ignore
	@Test
	public void valdateUsernameTest()
	{
		boolean status = homePage.userName();
		Assert.assertTrue(status);//Validation
	}
	
	@Test
	public void validate_create_company_Link_RedirectionTest()
	{

		homePage.clickOnCreateCompany();
	}
	
	@Test 
	public void validate_create_Contact_Link_RedirectionTest() {
		

		homePage.clickOnNewContact();
	}
	@Test
	public void validate_Deal_Link_RedirectionTest() {

		homePage.clickOnNewDeal();

	}
	@Test
	public void validate_Task_Link_RedirectionTest() {

		homePage.clickOnNewTask();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();


	}
    }


