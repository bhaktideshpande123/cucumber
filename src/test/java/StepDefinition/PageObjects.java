package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver;
	public PageObjects(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
 @FindBy(linkText="SignIn")
 public WebElement SignIn;
   
 @FindBy(name="userName")
 public  WebElement userName;
   
 
 @FindBy(name="password")
 public  WebElement password;
   
  
 @FindBy(name="Login")
 public  WebElement Login;
   
}
