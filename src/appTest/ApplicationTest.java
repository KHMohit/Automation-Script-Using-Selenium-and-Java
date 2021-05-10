package appTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ApplicationTest {
		
	ChromeDriver  driver;
	String url ="http://demo.guru99.com/v4/";
	
	@Test(priority= -100)
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KWmoh\\Desktop\\java_automation_script\\chromedriver.exe");
		
		driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	  }
	
	@Test(priority = 0)
	public void verifyTitle() {
		
		String expectedTitle = "Guru99 Bank Home Page";
		
		String  actualTitle =  driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority =10)
	public void verifyloginCre() {
		
		WebElement userId = driver.findElement(By.name("uid"));
		
	    WebElement  password = driver.findElement(By.name("password"));
	    
	    WebElement  button = driver.findElement(By.name("btnLogin"));
	    
	    userId.sendKeys("mngr325481");
	    
	    password.sendKeys("dYmahYn");
	    
	    button.click();

	}
	
	@Test(priority =20)
	public void addCustomer() {
		
		WebElement customerLink = driver.findElement(By.linkText("New Customer"));
		
		customerLink.click();
		
		driver.findElement(By.xpath("//input[@value='m']")).click();
		
		driver.findElement(By.name("name")).sendKeys("Jake civil");
		
		driver.findElement(By.name("dob")).sendKeys("01/10/1985");
		
		driver.findElement(By.name("addr")).sendKeys("H 123 Circle Street");
		
		driver.findElement(By.name("city")).sendKeys("Gurgram");
		
		driver.findElement(By.name("state")).sendKeys("Haryana");
		
		driver.findElement(By.name("pinno")).sendKeys("122001");
		
		driver.findElement(By.name("telephoneno")).sendKeys("223837485");
		
		driver.findElement(By.name("emailid")).sendKeys("meetJake10@cover.com");
		
		driver.findElement(By.name("password")).sendKeys("right@left");
		
		driver.findElement(By.name("sub")).click();
	}
	@Test(priority =40)
	private void getID() {
		 String customerID= driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		 
		 System.out.println("Customer id- " + customerID);

	}
}