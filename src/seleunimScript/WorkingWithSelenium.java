package seleunimScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSelenium {
      
	ChromeDriver  driver;
	String url ="http://facebook.com";
	 
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KWmoh\\Desktop\\java_automation_script\\chromedriver.exe");
		
		driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	  }
		public void getTitle() {
			
			String gettitle= driver.getTitle();
			System.out.println("The Title of the web page"+ gettitle);
		}
		
		public void close() {
			//driver.close();
			
			driver.quit();
		}
		
		public static void main(String[] args) {
			
			WorkingWithSelenium wc = new WorkingWithSelenium();
			
			wc.invokeBrowser();
			wc.getTitle();
			wc.close();
		}
	}
