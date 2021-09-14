package leave;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.LeavePage;

public class TC_12Test extends BaseTest {
	@Test
	public void leave() throws InterruptedException {
		LeavePage leave=new LeavePage(driver);
		leave.getLeaveTab().click();
		leave.getLeaveList().click();
		leave.getFromDate().clear();
		leave.getFromDate().sendKeys("13-09-2020");
		leave.getToDate().clear();
		leave.getToDate().sendKeys("13-09-2021");
		leave.getSearchbtn().click();
		driver.findElement(By.xpath("//label[text()='Taken']/..//input[@value='3']")).click();
		Thread.sleep(4000);
	}

}
