package login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.LoginPage;

public class Tc02Test extends BaseTest{
	@Test
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getUsernameTextField().clear();
		loginPage.getUsernameTextField().sendKeys("Admin1");
		Reporter.log("Successfully entered username into textFiled",true);
		Assert.assertEquals("Admin1", loginPage.getUsernameTextField().getAttribute("value"), "Username is Incorrect");
		loginPage.getPasswordTextFiled().clear();
		loginPage.getPasswordTextFiled().sendKeys("admin12");
		Reporter.log("Successfully entered password into textFiled",true);
		Assert.assertEquals("admin12", loginPage.getPasswordTextFiled().getAttribute("value"), "Password is Incorrect");
		loginPage.getLoginButton().click();
		Reporter.log("Successfully clicked on login button",true);
		Assert.assertEquals("Invalid credentials",loginPage.getErrorMessage().getText(), "User is Logged in");
		Reporter.log(loginPage.getErrorMessage().getText(),true);
	}
}
