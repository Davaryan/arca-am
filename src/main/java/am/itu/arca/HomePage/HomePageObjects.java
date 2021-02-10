package am.itu.arca.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.arca.HomePage.HomePageConstants.*;

import am.itu.arca.NewsPage.NewsPage;
import am.itu.arca.basePage.ArcaBasePage;

public class HomePageObjects extends ArcaBasePage {

	public HomePageObjects(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = HOME_PAGE_LOGO_XPATH)
	WebElement mainPageLogo;

	public boolean isLogoPresent() {
		return mainPageLogo.isDisplayed();
	}

	public void clickOnLogo() {
		mainPageLogo.click();
	}

	@FindBy(xpath = HOME_PAGE_HEADER_NEWS_XPATH)
	WebElement mainPageNews;
	
	public NewsPage goToNewsPage() {
		mainPageNews.click();
		return new NewsPage(driver);
		
	}
}
