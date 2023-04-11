package stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nopCom.pageObject.AdminPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base {

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe\\");
        driver=new ChromeDriver();
	  Thread.sleep(2000);
	  ad=new AdminPage(driver);
	}

	@When("User Open url  {string}")
	public void user_open_url(String url) throws Exception {
	   driver.get(url);
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   
	}
	
	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception  {
		ad.setUserName(email);
		   ad.setPassword(password);
		 Thread.sleep(2000);
	}

	@When("Click  on Login")
	public void click_on_login() throws Exception {
	   ad.ClickLogin();
   	Thread.sleep(2000);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws Exception {
	    	Assert.assertEquals(title, driver.getTitle());
	    	Thread.sleep(2000);
	}
	@Then("close browser")
	public void close_browser() throws Exception {
	  driver.close();
	  Thread.sleep(2000);
	}

}
