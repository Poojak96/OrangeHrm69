package Admin;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.AdminPage;
import pomRepository.HomePage;

public class TC_04Test extends BaseTest{

	@Test
	
	public void searchUser() {
		HomePage homePage=new HomePage(driver);
		homePage.getAdmin().click();
		AdminPage adminPage=new AdminPage(driver);
		adminPage.getSearchUserName().clear();
		adminPage.getSearchUserName().sendKeys("pooja");
		SelectClassUtil dropDown=new SelectClassUtil();
		dropDown.selectDropDown(adminPage.getUserRole(), "ESS");
		adminPage.getSearchemployeeName().sendKeys("David Morris");
		dropDown.selectDropDown(adminPage.getSearchstatus(), "Enabled");
		adminPage.getSearch().click();
	}
}
