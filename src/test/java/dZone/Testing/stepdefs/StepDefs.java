package dZone.Testing.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
	
		WebDriver driver;
		String landingPageURL = "https://dzone.com/";
		Actions act;
		String companySize="50,000 to 99,999";
		String JobRole= "Executive Manager, VP, CTO, CIO";

	@Given("User open a Browser")
	public void user_open_a_browser()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		act= new Actions(driver);
		
	}

	@Given("User Navigate frome Google Search Page to Landing Page of the Application")
	public void user_navigate_frome_google_search_page_to_landing_page_of_the_application() 
	{
		driver.navigate().to(landingPageURL);
		Assert.assertEquals("DZone: Programming & DevOps news, tutorials & tools",driver.getTitle());
		System.out.println(driver.getTitle());
	}
	
	@When("User click on the first link {string}")
	public void user_click_on_the_first_link(String string) 
	{
	    WebElement headerLinksEle = driver.findElement(By.xpath("//div[@class='header-bottom-container']//a[text()='Refcards']"));
	    
	    headerLinksEle.click();
	    
	}
	@When("User click on the Second link {string}")
	public void user_click_on_the_second_link(String string) 
	{

	    WebElement headerLinksEle2 = driver.findElement(By.xpath("//div[@class='header-bottom-container']//a[text()='Trend Reports']"));
	    
	    headerLinksEle2.click();
	    
	}
	
	@When("User click on the Third link {string}")
	public void user_click_on_the_third_link(String string) 
	{
		WebElement headerLinksEle3 = driver.findElement(By.xpath("//div[@class='header-bottom-container']//a[text()='Events']"));
	    
	    headerLinksEle3.click();
	}
	
	@Then("Open New page on the same Browser")
	public void open_new_page_on_the_same_browser() 
	{
//	    Assert.assertEquals("DZone: Programming & DevOps news, tutorials & tools",driver.getTitle());
//	    System.out.println(driver.getTitle());
//	    Assert.assertEquals("DZone Trend Reports",driver.getTitle());
//	    System.out.println(driver.getTitle());
	    Assert.assertEquals("DZone Events Library - DZone",driver.getTitle());
	    System.out.println(driver.getTitle());
	}
	@When("User hover the Mouse")
	public void user_hover_the_mouse() throws InterruptedException 
	{
	    WebElement methodAndCultureEle= driver.findElement(By.xpath("//div[@class='header-menu parent-category']//a[text()='Culture and Methodologies']"));
	    act.moveToElement(methodAndCultureEle).perform();
	    Thread.sleep(1000);
	    WebElement dataEnggEle= driver.findElement(By.xpath("//div[@class='header-menu parent-category']//a[text()='Data Engineering']"));
	    act.moveToElement(dataEnggEle).perform();
	    Thread.sleep(1000);
	    WebElement softwrDesEle= driver.findElement(By.xpath("//div[@class='header-menu parent-category']//a[text()='Software Design and Architecture']"));
	    act.moveToElement(softwrDesEle).perform();
	    Thread.sleep(1000);
	    WebElement codingEle= driver.findElement(By.xpath("//div[@class='header-menu parent-category']//a[text()='Coding']"));
	    act.moveToElement(codingEle).perform();
	    Thread.sleep(1000);
	    WebElement testingEle= driver.findElement(By.xpath("//div[@class='header-menu parent-category']//a[text()='Testing, Deployment, and Maintenance']"));
	    act.moveToElement(testingEle).perform();
	    Thread.sleep(1000);
	   
	}

	@When("User Click on the Join Button")
	public void user_click_on_the_join_button() 
	{
	   WebElement joinEle = driver.findElement(By.xpath("//a[text()='Join']"));
	   joinEle.click();
	}

	@Then("Fill the MemberShip Form")
	public void fill_the_member_ship_form() 
	{
	    driver.findElement(By.xpath("//input[@ng-model='registration.data.email']")).sendKeys("john@gmail.com");
	    driver.findElement(By.xpath("//input[@ng-model='registration.data.username']")).sendKeys("johnPeter12");
	    driver.findElement(By.xpath("//input[@id='registration-password-field']")).sendKeys("john13456");
	    driver.findElement(By.xpath("//input[@id='registrationFirstName']")).sendKeys("john");
	    driver.findElement(By.xpath("//input[@id='registrationLastName']")).sendKeys("Peter");
	    driver.findElement(By.xpath("//input[@id='registrationCompanyName']")).sendKeys("jp.pvt.ltd");
	    driver.findElement(By.xpath("//input[@id='registrationJobTitle']")).sendKeys("QA");
	    WebElement companySizeEle= driver.findElement(By.xpath("//select[@id='registrationCompanySize']"));
	    
	    Select comSize= new Select(companySizeEle);
	    
	    comSize.selectByVisibleText(companySize);
	    
	    WebElement jobRoleEle= driver.findElement(By.xpath("//select[@id='registrationJobRole']"));
	    
	    Select RoleOfJob= new Select(jobRoleEle);
	    
	    RoleOfJob.selectByVisibleText(JobRole);
	    
	    WebElement CheckBoxEle= driver.findElement(By.xpath("//input[@type='checkbox']"));
	    
	    CheckBoxEle.click();
	    
	    Assert.assertTrue(CheckBoxEle.isSelected());
	 	}
	@Then("Join the MemberShip")
	public void join_the_member_ship() 
	{
		 WebElement joinBtn= driver.findElement(By.xpath("//button[@type='submit']"));
		    joinBtn.click();
	}

	@Then("Close the Application")
	public void close_the_application() 
	{
	    driver.quit();
	}

}
