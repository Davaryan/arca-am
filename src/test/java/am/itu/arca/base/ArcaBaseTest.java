package am.itu.arca.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ArcaBaseTest {

	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://cabinet.arca.am/");
		driver.manage().window().maximize();
		System.out.println("after wait");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
