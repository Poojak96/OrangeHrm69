package directory;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.DirectoryPage;

public class TC14_Test extends BaseTest {
	
	@Test()
	public void directory() throws InterruptedException {
		DirectoryPage dir= new DirectoryPage(driver);
		dir.getDirectoryTab().click();
		Reporter.log("Directory Page is Displayed",true);
		dir.getSearchName().sendKeys("Garry White");
		dir.getSearchButton();
		String userName = driver.findElement(By.xpath("//b[text()='Garry White']")).getText();
		Assert.assertEquals(userName,"Garry White","User not found");
		Reporter.log("User found",true);
		Thread.sleep(3000);
				
	}
	

}
