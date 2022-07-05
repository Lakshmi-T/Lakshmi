package lakshmi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Registration {
	WebDriver driver;
  @Test
  public void test() {
	  String path1="D:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
	 driver=new ChromeDriver();
	 driver.get("file:///C:/Users/itctesting37/Downloads/Portfolio-Web_Application-Project-main/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/index.html");
	 String org="Portfolio Launches Registration page! ";
		String actual=driver.getTitle();
		driver.findElement(By.id("firstname")).sendKeys("lakshmi");
		driver.findElement(By.id("lastname")).sendKeys("Thorlakonda");
		WebElement dateDob = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dateDob.sendKeys("20062022");
		driver.findElement(By.id("email")).sendKeys("lakshmi123@gmail.com");
		driver.findElement(By.id("phone number")).sendKeys("9704737208");
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Female");
		gender.selectByIndex(2);
		driver.findElement(By.id("address")).sendKeys("Narasaraopet,");
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Andhra Pradesh");
		state.selectByIndex(11);
		WebElement uploadElement = driver.findElement(By.id("resume"));
		uploadElement.sendKeys("D:\\Lakshmi_Resume.pdf");
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"registrationdate\"]"));
		dateBox.sendKeys("20062022");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0130PM");
		driver.findElement(By.id("password")).sendKeys("Lakshmi@123");
		driver.findElement(By.id("confirm password")).sendKeys("Lakshmi@123");
		
	 Assert.assertEquals(org,actual);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Application starting");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
