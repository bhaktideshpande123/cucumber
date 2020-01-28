package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	PageObjects po;
	public static WebDriver driver;

	@Given("^navigate to Home page$")
	public void whenonhomepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\bhakti selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		po = new PageObjects(driver);
	}

	@When("^user enters username and password$")
	public void credentials() {
		po.SignIn.click();
		po.userName.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.Login.click();
	}

	@Then("^user logged in successfully$")
	public void loginsuccess() {
		System.out.println("user login successfully");
	}

	@When("^Larry searches below products in the search box:$")
	public void productsearch(DataTable dt) {
		List<String> product = dt.asList(String.class);
		for (String s : product) {
			driver.findElement(By.id("myInput")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("//@[href='logout.htm']"));
		}

	}

	@Then("^product should be added in the cart if available$")
	public void productadded() {

	}

	@When("^ i enter\"([^\"]*)\" and \"([^\"]*)\"$")
	public void entervalues(String uname, String pwd) {

		po.SignIn.click();
		po.userName.sendKeys(uname);
		po.password.sendKeys(pwd);
		po.Login.click();

	}
}
