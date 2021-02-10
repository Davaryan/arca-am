package am.itu.arca.HomePageTests;

import org.testng.annotations.Test;

import am.itu.arca.HomePage.HomePageObjects;
import am.itu.arca.base.ArcaBaseTest;

public class HomePageLogoTest extends ArcaBaseTest{

	@Test(priority=1)
	public void navigateToNewsPage() throws InterruptedException {
		HomePageObjects newsLink = new HomePageObjects(driver);
		Thread.sleep(4000);
		newsLink.goToNewsPage();
		Thread.sleep(4000);
	}
//	public void mainPageLogoIsPresent() {
//		HomePageObjects mainLogo = new HomePageObjects(driver);
//		mainLogo.isLogoPresent();
//		mainLogo.clickOnLogo();
//	}
}
