// Generated by Selenium IDE
package pkg_mavenTestNg;
import java.lang.*;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.*;
public class SaucelabsAutomationTestNGTest {
	public static String url_app="http://localhost:9080/RegistrationForm/";
    public static WebDriver driver;
  
  
  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();

  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void Login() throws InterruptedException {
    driver.get("http://localhost:9080/RegistrationForm/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.id("textname")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("textname"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("textname")).sendKeys("standard_user");
    {
      List<WebElement> elements = driver.findElements(By.id("fathername"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("fathername")).sendKeys("secret_sauce");
    {
      List<WebElement> elements = driver.findElements(By.id("paddress"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("paddress")).sendKeys("Hyderbad");
  }
    @Test(priority=1)
    public void personal_address() throws InterruptedException {
    driver.findElement(By.id("personaladdress")).click();
    driver.findElement(By.id("personaladdress")).sendKeys("Secundrabad");
    
    }
    
    @Test(priority=2)
    public void genderDetails() throws InterruptedException {
    //click male radio button
    	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input[1]")).click();
    
    }
    
    @Test(priority=3)
    public void select_city() throws InterruptedException {
    	Select drpCountry = new Select(driver.findElement(By.name("City")));
		drpCountry.selectByVisibleText("BANGALORE");		
	}


    
    @Test(priority=4)
    public void select_course() throws InterruptedException {
    	Select drpCountry = new Select(driver.findElement(By.name("Course")));
		drpCountry.selectByVisibleText("MCA");		
	}
    
    @Test(priority=5)
    public void select_district() throws InterruptedException {
    	Select drpCountry1 = new Select(driver.findElement(By.name("District")));
		drpCountry1.selectByVisibleText("NALANDA");		
	}
    
    @Test(priority=6)
    public void Addressdetails() throws InterruptedException {
    	driver.findElement(By.id("pincode")).click();
        driver.findElement(By.id("pincode")).sendKeys("123231");
        
        driver.findElement(By.id("emailid")).click();
        driver.findElement(By.id("emailid")).sendKeys("gmail123@gmail.com");
        
        driver.findElement(By.id("dob")).click();
        driver.findElement(By.id("dob")).sendKeys("12112022");
        
        driver.findElement(By.id("mobileno")).click();
        driver.findElement(By.id("mobileno")).sendKeys("9860123231");
        
        //click reset button
        
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[15]/td[1]/input")).click();
        
        
        
        		
	}
    
    
    
  }


