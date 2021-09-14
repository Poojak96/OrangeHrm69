package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitmentCandidatePage;

public class TC_05Test extends BaseTest{

	@Test
	public void addCandidateDetails() {
		HomePage homePage=new HomePage(driver);
		homePage.getRecruitment().click();
		RecruitmentCandidatePage recruitementPage=new RecruitmentCandidatePage(driver);
		recruitementPage.getAddButton().click();
		recruitementPage.getFirstNameTextField().sendKeys("pooja");
		recruitementPage.getMiddleNameTextField().sendKeys("poo");
		recruitementPage.getLastNameTextField().sendKeys("k");
		recruitementPage.getEmailTextField().sendKeys("poo121069@gmail.com");
		recruitementPage.getContactNoTextField().sendKeys("7019464591");
		recruitementPage.getJobVacancyDropdown().click();
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(recruitementPage.getJobVacancyDropdown(), "Associate IT Manager");
		recruitementPage.getResume().sendKeys("C:\\Users\\Admin\\Desktop\\adb.txt");
		recruitementPage.getKeywordsTextField().sendKeys("abc");
		recruitementPage.getCommentsTextField().sendKeys("details of Candidate");
		recruitementPage.getCheckbox().click();
		recruitementPage.getSaveButton().click();
	}
}

