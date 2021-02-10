package am.itu.arca.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArcaBasePage {
  protected WebDriver driver;
  
  public ArcaBasePage (WebDriver driver) {
	  this.driver =driver;
	  PageFactory.initElements(this.driver,this);
  }
}
